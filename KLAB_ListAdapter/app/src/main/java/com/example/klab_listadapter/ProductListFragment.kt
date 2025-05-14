package com.example.klab_listadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.klab_listadapter.R
import com.example.klab_listadapter.Product
import com.example.klab_listadapter.ProductAdapter

class ProductListFragment : Fragment() {
    interface OnProductClickListener {
        fun onProductClicked(product: Product)
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    private var listener: OnProductClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val products = listOf(
            Product(
                id = 1,
                title = "Essence Mascara Lash Princess",
                description = "The Essence Mascara Lash Princess is a popular mascara known for its volumizing and lengthening effects. Achieve dramatic lashes with this long-lasting and cruelty-free formula.",
                category = "beauty",
                price = 9.99,
                rating = 2.56
            ),
            Product(
                id = 2,
                title = "Glow Serum",
                description = "A hydrating serum for radiant skin.",
                category = "beauty",
                price = 19.99,
                rating = 4.1
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(context)
        adapter = ProductAdapter { product ->
            listener?.onProductClicked(product)
        }
        recyclerView.adapter = adapter
        adapter.submitList(products)
    }

    override fun onAttach(context: android.content.Context) {
        super.onAttach(context)
        if (context is OnProductClickListener) {
            listener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
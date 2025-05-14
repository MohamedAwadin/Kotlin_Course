package com.example.klab_listadapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.klab_listadapter.R
import com.example.klab_listadapter.Product

class ProductDetailsFragment : Fragment() {
    companion object {
        fun newInstance(product: Product): ProductDetailsFragment {
            val fragment = ProductDetailsFragment()
            val args = Bundle()
            args.putParcelable("PRODUCT" as String, product)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_details, container, false)
        val product = arguments?.getParcelable<Product>("PRODUCT" as String)

        product?.let {
            view.findViewById<TextView>(R.id.titleText).text = it.title
            view.findViewById<TextView>(R.id.descriptionText).text = it.description
            view.findViewById<TextView>(R.id.categoryText).text = it.category
            view.findViewById<TextView>(R.id.priceText).text = "$${it.price}"
            view.findViewById<TextView>(R.id.ratingText).text = it.rating.toString()
        }

        return view
    }

    fun updateProduct(product: Product?) {
        val titleText = view?.findViewById<TextView>(R.id.titleText)
        val descriptionText = view?.findViewById<TextView>(R.id.descriptionText)
        val categoryText = view?.findViewById<TextView>(R.id.categoryText)
        val priceText = view?.findViewById<TextView>(R.id.priceText)
        val ratingText = view?.findViewById<TextView>(R.id.ratingText)

        product?.let {
            titleText?.text = it.title
            descriptionText?.text = it.description
            categoryText?.text = it.category
            priceText?.text = "$${it.price}"
            ratingText?.text = it.rating.toString()
        } ?: run {
            titleText?.text = "No product selected"
            descriptionText?.text = ""
            categoryText?.text = ""
            priceText?.text = ""
            ratingText?.text = ""
        }
    }
}
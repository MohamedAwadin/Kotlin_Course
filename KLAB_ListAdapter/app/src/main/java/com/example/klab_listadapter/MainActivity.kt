package com.example.klab_listadapter

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.klab_listadapter.R
import com.example.klab_listadapter.Product
import com.example.klab_listadapter.ProductListFragment
import com.example.klab_listadapter.ProductDetailsFragment

class MainActivity : AppCompatActivity(), ProductListFragment.OnProductClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ProductListFragment())
                .commit()
        }
    }

    override fun onProductClicked(product: Product) {
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerDetails, ProductDetailsFragment.newInstance(product))
                .commit()
        } else {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("PRODUCT" as String, product)
            startActivity(intent)
        }
    }
}
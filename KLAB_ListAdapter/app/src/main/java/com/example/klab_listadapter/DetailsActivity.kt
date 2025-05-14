package com.example.klab_listadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.klab_listadapter.R
import com.example.klab_listadapter.Product
import com.example.klab_listadapter.ProductDetailsFragment

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val product = intent.getParcelableExtra<Product>("PRODUCT" as String)
        if (product != null && savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.detailsContainer, ProductDetailsFragment.newInstance(product))
                .commit()
        }
    }
}
package com.example.search1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pager = findViewById<RecyclerView>(R.id.item_list)
        pager.adapter = shopingitemslistadapter(createProductList())
        pager.layoutManager = LinearLayoutmanager(this)


    }
    fun  createProductList()= ListOf(
        Product(productName = "Items 1", productDescription = "Product Desc", productPrice = "10$"),
        Product(productName = "Items 2", productDescription = "Product Desc 1", productPrice = "15$"),
        Product(productName = "Items 3", productDescription = "Product Desc 2", productPrice = "20$"),
        Product(productName = "Items 4", productDescription = "Product Desc 3", productPrice = "30$"),
    )
}
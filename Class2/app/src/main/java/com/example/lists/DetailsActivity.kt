package com.example.lists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val fullname = intent.extras?.getString(KEY_NAME)
        val phone= intent.extras?.getString(KEY_PHONE)

        println("Extra data $fullname $phone")
    }
}
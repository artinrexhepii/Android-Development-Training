package com.example.myapplication3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pager = findViewById<ViewPager2>(R.id.pager)
        pager.adapter = ImagePagerAdapter(createImageUrl())
    }
fun createImageUrl()= listOf(getString(R.string.imageUrl), getString(R.string.imageUrl2), getString(R.string.imageUrl3))
}
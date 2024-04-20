package com.tahirietrit.fragments

import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val home = findViewById<ImageButton>(R.id.home)
        home.setOnClickListener {
            showFragment(FragmentHome())
        }
        val search = findViewById<ImageButton>(R.id.search)
        search.setOnClickListener {
            var fragmet = FragmentSearch()
            val bundle = Bundle()
            bundle.putString("extra_string",
                "This string is an argment")
            fragmet.arguments = bundle
            showFragment(fragmet)
        }
        val profile = findViewById<ImageButton>(R.id.profrile)
        profile.setOnClickListener {
            showFragment(FragmentProfile())
        }
        showFragment(FragmentHome())

    }
    private fun showFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(fragment.id.toString())
            .commit()
    }
}
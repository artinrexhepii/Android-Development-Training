package com.example.lists

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val contactsRecycler = findViewById<RecyclerView>(R.id.contacts_recycler)
        val adapter =  ContactListAdapter(getContacts())
        contactsRecycler.layoutManager = LinearLayoutManager(this)
        contactsRecycler.adapter=adapter
        }

    fun getContacts(): List<Contact>{
        return listOf(
            Contact(fullName = "Artin Rexhepi", phoneNumber = "049154521"),
            Contact(fullName = "John Doe", phoneNumber = "048555112"),
            Contact(fullName = "Johm Smith", phoneNumber = "048556213"),
            Contact(fullName = "Filan Fisteku", phoneNumber = "044859652"),


        )
    }
    }

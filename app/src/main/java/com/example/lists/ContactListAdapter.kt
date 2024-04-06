package com.example.lists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactListAdapter(val contactList: List<Contact>): RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {
    class ViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        val  initalsTextview = view.findViewById<TextView>(R.id.initials_textView)
        val  fullNameTextview = view.findViewById<TextView>(R.id.fullname_textView)
        val  phoneNumberTextview = view.findViewById<TextView>(R.id.phoneNumber_textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount(): Int =contactList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullNameTextview.text = contactList[position].fullName
        holder.phoneNumberTextview.text = contactList[position].phoneNumber
        holder.initalsTextview.text = contactList[position].getInitials()
    }




}
package com.example.myapplication3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso

class ImagePagerAdapter(val imagesList: List<String>) : RecyclerView.Adapter<ImagePagerAdapter.ViewHolder>() {
    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val image = view.findViewById<ImageView>(R.id.content_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagePagerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_pager,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int  = imagesList.size

    override fun onBindViewHolder(holder: ImagePagerAdapter.ViewHolder, position: Int) {
        val imageUrl =imagesList[position]
        Picasso.get().load(imageUrl).into(holder.image)
    }

}

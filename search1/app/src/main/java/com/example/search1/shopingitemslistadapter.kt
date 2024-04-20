package com.example.search1


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.reflect.KFunction1



class ShoppingItemsListAdapter(val products: List<Product>):
    RecyclerView.Adapter<ShoppingItemsListAdapter.ViewHolder>() {

    class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val productImage = view.findViewById<TextView>(R.id.image1)
        val productName = view.findViewById<TextView>(R.id.text1)
        val productDescription = view.findViewById<TextView>(R.id.Description)
        val productPrice=view.findViewById<TextView>(R.id.price)
    }

    override fun onCreateViewHolder
                (parent: ViewGroup,
                 viewType: Int
    ):
            ShoppingItemsListAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int  = products.size

    override fun onBindViewHolder(holder: ShoppingItemsListAdapter.ViewHolder, position: Int) {

        val product=products[position]

        val holder.productName.text =product.productName
        holder.productDescription.text = product.productDescription
        holder.productPrice.text = product.productPrice
        Picasso.get().load(product.productImage).into(holder.productImage)
    }

}


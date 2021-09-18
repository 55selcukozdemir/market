package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(var productList: ArrayList<Product>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.productname.text = productList[position].name
        holder.productprice.text = productList[position].price.toString()
        holder.productimage.setImageResource(productList[position].image)
    }

    override fun getItemCount(): Int {
        return productList.size
    }


    class ViewHolder (view: View): RecyclerView.ViewHolder(view) {
        var productname = view.findViewById<TextView>(R.id.product_name)
        var productprice = view.findViewById<TextView>(R.id.product_price)
        var productimage = view.findViewById<ImageView>(R.id.product_image)
    }
}
package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.model.Product
import com.example.myapplication.R

class CustomGridAdapter: BaseAdapter {

    var productList = ArrayList<Product>()
        var contex: Context? = null

    constructor(productList: ArrayList<Product>, contex: Context?) : super() {
        this.productList = productList
        this.contex = contex
    }


    override fun getCount(): Int {
        return productList.size
    }

    override fun getItem(p0: Int): Any {
        return productList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {



        var inflator = contex!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        //Kendi yaptığımız tasarımı burada bağlama işlemi yapıyoruz ve sırasıylada bu tekrarlanıyor.
        var productView = inflator.inflate(R.layout.product,p2,false)
        productView.findViewById<ImageView>(R.id.product_image).setImageResource(productList[p0].image)
        productView.findViewById<TextView>(R.id.product_name).text = productList[p0].name
        productView.findViewById<TextView>(R.id.product_price).text = productList[p0].price.toString()
        return productView


    }
}
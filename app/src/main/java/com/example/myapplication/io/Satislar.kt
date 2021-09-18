package com.example.myapplication.io

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.myapplication.CustomGridAdapter
import com.example.myapplication.Product
import com.example.myapplication.R


class Satislar : Fragment() {


    var adapter: CustomGridAdapter? = null



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        var inf = inflater.inflate(R.layout.fragment_satislar, container, false)



        var productlist = arrayListOf<Product>(
            Product("biber",15f,R.drawable.bookmark),
            Product("domates",15f,R.drawable.stokdurumu),
            Product("patlıcan",15f,R.drawable.urunekle),
            Product("hıyar",15f,R.drawable.satis),
            Product("biber",15f,R.drawable.bookmark),
            Product("domates",15f,R.drawable.stokdurumu),
            Product("patlıcan",15f,R.drawable.urunekle),
            Product("hıyar",15f,R.drawable.satis)
        )

        adapter = CustomGridAdapter(productlist, context)


        var gridView = inf.findViewById<GridView>(R.id.grid_view)
        gridView.adapter = adapter

        return inf

    }
}
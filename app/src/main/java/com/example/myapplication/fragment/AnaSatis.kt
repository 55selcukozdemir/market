package com.example.myapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.CustomAdapter
import com.example.myapplication.model.Product

import com.example.myapplication.R
import com.example.myapplication.adapter.CustomGridAdapter


class AnaSatis : Fragment(){


    var adapter: CustomGridAdapter? = null
    //lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_ana_satis, container, false)
        //var list = arrayListOf<String>("veli","ali","selçuk","class", "kerim","kotlin","muhammet","mehmet","veli","ali","selçuk","class", "kerim","kotlin","muhammet","mehmet")
        /*
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(view.context)
        recyclerView.adapter = CustomAdapter(productlist)

         */
        var productlist = arrayListOf<Product>(
            Product("biber",15f,R.drawable.s),
            Product("domates",15f,R.drawable.stokdurumu),
            Product("patlıcan",15f,R.drawable.urunekle),
            Product("hıyar",15f,R.drawable.satis),
            Product("biber",15f,R.drawable.bookmark),
            Product("domates",15f,R.drawable.stokdurumu),
            Product("patlıcan",15f,R.drawable.urunekle),
            Product("hıyar",15f,R.drawable.satis)
        )


        var gridView = view.findViewById<GridView>(R.id.ana_satis_fragment_grid_view)
        adapter = CustomGridAdapter(productlist,context)
        gridView.adapter = adapter
        return view

    }

}
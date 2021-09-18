package com.example.myapplication.io

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.CustomAdapter
import com.example.myapplication.Product

import com.example.myapplication.R
import kotlinx.coroutines.channels.consumesAll


class AnaSatis : Fragment(){


    lateinit var recyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_ana_satis, container, false)
        //var list = arrayListOf<String>("veli","ali","selçuk","class", "kerim","kotlin","muhammet","mehmet","veli","ali","selçuk","class", "kerim","kotlin","muhammet","mehmet")

        var productlist = arrayListOf<Product>(
            Product("biber",15f,R.drawable.bookmark),
            Product("domates",15f,R.drawable.stokdurumu),
            Product("patlıcan",15f,R.drawable.urunekle),
            Product("hıyar",15f,R.drawable.satis)
        )

        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager=LinearLayoutManager(view.context)
        recyclerView.adapter = CustomAdapter(productlist)

        return view

    }

}
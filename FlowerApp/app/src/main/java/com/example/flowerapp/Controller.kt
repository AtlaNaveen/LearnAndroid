package com.example.flowerapp

import android.content.Context
import android.widget.AbsListView
import android.widget.ListView

class Controller(val context: Context, val listView: ListView) {

    val myModel = Model()
    val flowerList = myModel.listOfFlowerObjects

    fun connect(){
        val myAdapter = MyAdapter(context, R.layout.item_flower, flowerList)
        listView.adapter = myAdapter
    }
}
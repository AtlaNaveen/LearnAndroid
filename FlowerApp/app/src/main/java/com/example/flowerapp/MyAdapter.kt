package com.example.flowerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(context: Context, val resource: Int, objects: MutableList<Flower>) :
    ArrayAdapter<Flower>(context, resource, objects){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val flower = getItem(position)
        var view = LayoutInflater.from(context).inflate(resource, parent, false)

        val viewImage = view.findViewById<ImageView>(R.id.flowerImage)
        val viewText = view.findViewById<TextView>(R.id.flowerName)

        viewImage.setImageResource(flower!!.img)
        viewText.setText(flower!!.name)

        return view
    }
}
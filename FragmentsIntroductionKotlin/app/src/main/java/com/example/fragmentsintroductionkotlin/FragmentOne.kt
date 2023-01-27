package com.example.fragmentsintroductionkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment

class FragmentOne : Fragment(){
    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        val myButton = view.findViewById<View>(R.id.my_button) as Button
        val myEditText = view.findViewById<View>(R.id.my_edit_text) as EditText
        myButton.setOnClickListener { v ->
            val message = myEditText.text.toString()
            Toast.makeText(v.context, "Text Entered: $message", Toast.LENGTH_SHORT).show()
        }
    }
}
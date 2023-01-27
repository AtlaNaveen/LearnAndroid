package com.example.fragmentsintroductionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Static Fragments
        //setContentView(R.layout.activity_main_one)

        // Dynamic Fragments
        setContentView(R.layout.activity_main_two)
        setupViews()
    }

    private fun setupViews() {
        val button1 = findViewById<Button>(R.id.one_button)
        button1.setOnClickListener {
            // FragmentOne Will Create Small View Hierarchy i.e. View Tree
            // This View Hierarcy It Will Attach With View Hierarchy Created By Activity
            // Will Attach At Attach Piont
            replaceFragment(FragmentOne())
        }

        findViewById<View>(R.id.two_button).setOnClickListener {
            replaceFragment(FragmentTwo())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()

        // Fragment Is Small Part of View Hierarchy
        // right_hand_side_container Is Our Attach Point
        // Will Attach View Hierarchy Created By Fragment At Attach Point
        transaction.replace(R.id.right_hand_side_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
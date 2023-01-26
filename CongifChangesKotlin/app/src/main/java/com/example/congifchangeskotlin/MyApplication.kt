package com.example.congifchangeskotlin

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyApplication:AppCompatActivity() {
    private var singleton: MyApplication? = null
    private val TAG = "MyApplication"

    // Returns the application instance
    fun getInstance(): MyApplication? {
        return singleton
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        singleton = this
        Log.d(TAG, "onCreate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG, "onLowMemory")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(TAG, "onTrimMemory")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig!!)
        Log.d(TAG, "onConfigurationChanged")
    }

}



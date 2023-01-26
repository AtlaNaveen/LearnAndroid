package com.example.congifchangeskotlin

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log

class MyActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        Log.d(TAG, "onCreate")
    }

    /**
     * Listing 3-6: Handling configuration changes in code
     */
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        // [ ... Update any UI based on resource values ... ]
        Log.d(TAG, "onConfigurationChanged")
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // [ ... React to different orientation ... ]\
            Log.d(TAG, "Orientation Landscape")
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            // [ ... React to changed keyboard visibility ... ]
            Log.d(TAG, "Keyboard Hidden No")
        }
    }

    companion object {
        /**
         * Called when the activity is first created.
         */
        private const val TAG = "MyActivity"
    }
}
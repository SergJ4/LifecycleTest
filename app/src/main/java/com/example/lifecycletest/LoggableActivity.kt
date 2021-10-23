package com.example.lifecycletest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class LoggableActivity : AppCompatActivity() {

    var tag = "ACTIVITY A"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tag = intent.extras?.getString("TAG", "ACTIVITY A") ?: "ACTIVITY A"
        Log.e(tag, "ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag, "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag, "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag, "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "ON DESTROY")
    }
}
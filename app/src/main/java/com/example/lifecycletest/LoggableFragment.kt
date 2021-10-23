package com.example.lifecycletest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LoggableFragment : Fragment() {

    var myTag = "FRAGMENT A"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(myTag, "ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.e(myTag, "ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.e(myTag, "ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.e(myTag, "ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.e(myTag, "ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(myTag, "ON DESTROY")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(myTag, "ON CREATE VIEW")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(myTag, "ON VIEW CREATED")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(myTag, "ON DESTROY VIEW")
    }
}
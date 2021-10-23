package com.example.lifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : LoggableActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(
                Intent(this, LoggableActivity::class.java)
                    .apply {
                        putExtra("TAG", "ACTIVITY B")
                    }
            )
        }
    }
}
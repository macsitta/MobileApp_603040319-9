package com.example.mobilelab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        val message = intent.getStringExtra(EXTRA_MESSAGE);
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message;

        }
    }
}

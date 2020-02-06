package com.example.mobilelab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "eiei oo";
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this,
            Activity_display::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}

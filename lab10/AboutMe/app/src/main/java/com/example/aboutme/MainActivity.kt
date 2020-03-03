package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val manee = MyName("Manee Jaidee")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myName = manee
        binding.doneBtn.setOnClickListener {
            addNickname(it)
        }
        /*findViewById<Button>(R.id.doneBtn).setOnClickListener {
            addNickname(it)
        }*/
    }

    private fun addNickname(view : View){
        /*val editText = findViewById<EditText>(R.id.editText)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)*/
        manee?.nickname = nickname_text.text.toString()
        binding.nicknameText.text = binding.editText.text
        binding.editText.visibility = View.GONE
        binding.doneBtn.visibility = View.GONE
        binding.nicknameText.visibility = View.VISIBLE
    }


}

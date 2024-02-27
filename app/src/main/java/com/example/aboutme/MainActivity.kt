package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.inputmethod.InputMethodManager



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addnickname(it) //it reference context pass sathi//
        }


    }

    private  fun addnickname(view: View)
    {
        val editText = findViewById<EditText>(R.id.nick_name_edit)  // casting <EditText> //

        val nickname = findViewById<TextView>(R.id.nickname_view)

        nickname.text = editText.text
        editText.visibility = View.GONE

        nickname.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}
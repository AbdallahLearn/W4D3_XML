package com.example.w4d3_xml

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.activity.ComponentActivity

import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.constraint_layout)

        val email= findViewById<EditText>(R.id.emailEditText)
        email.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                Log.i("MainActvity ", "Char = $s , start = $start, before = $after, count = $count ")

            }


            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//               Log.i("MainActvity ", "Char = $s , start = $start, before = $before, count = $count ")
            }

            override fun afterTextChanged(s: Editable?) {
                Log.i("MainActvity ", "Editable = $s ")

            }
        })


//        setContentView(R.layout.activty_main)
//        setContentView(R.layout.relative_layout)

    }
}


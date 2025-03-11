package com.example.w4d3_xml

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activty_main)
        setContentView(R.layout.relative_layout)
//        setContentView(R.layout.constraint_layout)
    }
}


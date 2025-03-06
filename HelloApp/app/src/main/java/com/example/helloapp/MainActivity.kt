package com.example.helloapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val input : EditText = findViewById(R.id.input)
        val btnHello : Button = findViewById(R.id.btnHello)
        val tvHello : TextView = findViewById(R.id.tvHellow)

        btnHello.setOnClickListener {
            val str : String = input.text.toString()
            tvHello.text = "Hello $str"
        }
    }
}
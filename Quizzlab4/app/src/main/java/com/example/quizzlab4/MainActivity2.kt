package com.example.quizzlab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setName()
    }

    private fun setName(){
        val textV = findViewById<TextView>(R.id.tvNameValue)
        val name = intent.getStringExtra("user_name")
        textV.text = name
    }
}
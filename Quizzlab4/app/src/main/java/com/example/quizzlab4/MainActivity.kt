package com.example.quizzlab4

//1.

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"
    private lateinit var getstartedButton : Button

    val TAG1: String = "MainActivity"

    override fun onStart() {  //minden lifecycle-t kiprobalni
        super.onStart()
        Log.i(TAG, "onStart() called.")

    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() called")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() called")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {  //az activ
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate() called.")  //debug uzenetek
        initViewItems()
        //registerListener()
    }
    private fun initViewItems(){
        val startButton = findViewById<Button>(R.id.btnStart);
        val editText : EditText = findViewById(R.id.etPlayerName);
        startButton.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("user_name",editText.text.toString());
            startActivity(intent)
        }
    }
//    private fun registerListener(){
//        getstartedButton.setOnClickListener{
//
//            val text = "Hello toast!"
//            val duration = Toast.LENGTH_SHORT
//            val toast = Toast.makeText(applicationContext, text, duration)
//            toast.show()
//
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//            val bundle = Bundle()
//            bundle.putString("a", "2")
//            intent.putExtras(bundle)
//        }
//    }
}


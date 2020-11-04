package com.example.customerrorscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = mutableListOf<String>()
        array[0] = "Hello"
        findViewById<TextView>(R.id.textView).text = array[1]

    }
}
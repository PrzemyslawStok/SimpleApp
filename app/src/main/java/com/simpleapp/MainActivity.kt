package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1:TextView = findViewById(R.id.textView1)
        val startButton: Button = findViewById(R.id.startButton)

        textView1.setText("TextView")

        startButton.setOnClickListener {
            textView1.setText("Text1")
        }

        add(10.0,20.0)
    }

    fun add(x: Double, y: Double):Double{
        return x+y
    }
}
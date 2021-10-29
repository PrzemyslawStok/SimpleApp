package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.simpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*setContentView(R.layout.activity_main)

        val textView1:TextView = findViewById(R.id.textView1)
        val startButton: Button = findViewById(R.id.startButton)


        startButton.setOnClickListener {
            textView1.setText("$i")
            i++
        }
        */

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity1)

        binding.textView1.setText("TextView")

        binding.startButton.setOnClickListener{
            binding.textView1.setText("$i")
        }

        add(10.0,20.0)
    }

    fun add(x: Double, y: Double):Double{
        return x+y
    }
}
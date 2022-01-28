package com.simpleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        setContentView(binding.root)




        binding.startButton.setOnClickListener {


            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }

        binding.nextButton.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        binding.endButton.setOnClickListener {
            val intent = Intent(this, EndActivity::class.java)
            startActivity(intent)
        }

        add(10.0, 20.0)
    }

    fun add(x: Double, y: Double): Double {
        return x + y
    }
}
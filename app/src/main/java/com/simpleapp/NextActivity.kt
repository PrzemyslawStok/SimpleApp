package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.simpleapp.databinding.ActivityNextLayoutBinding
import kotlin.random.Random

class NextActivity : AppCompatActivity() {
    var initNumber = 0
    var number = 0
    var trialsNumber = 0
    var record = 1000
    var firstRun = true

    var mainNumberText: TextView? = null
    var recordText: TextView? = null
    var currentTrial: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_next_layout)

        //number = initNumber

        newGame()

        val binding = ActivityNextLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainNumberText = binding.mainTextView
        recordText = binding.textViewRecord
        currentTrial = binding.textViewCurrentTrial

        binding.mainTextView.setText("${number}")

        binding.buttonLeft.setOnClickListener {
            number += 9

            restartGame()
        }


        binding.buttonRight.setOnClickListener {
            number -= 7

            restartGame()
        }

        binding.buttonUp.setOnClickListener {
            number += 3

            restartGame()
        }

        binding.buttonDown.setOnClickListener {
            number -= 5

            restartGame()
        }

    }

    fun newGame() {
        if(!firstRun)
            recordText?.setText("$record")

        while (number == 0) {
            number = Random.nextInt(-100, 100)
        }

        if (record > trialsNumber && !firstRun) {
            record = trialsNumber
            recordText?.setText("$record")
        }

        mainNumberText?.setText("$number")
        trialsNumber = 0
        currentTrial?.setText("$trialsNumber")

        firstRun = false
    }

    fun restartGame() {
        trialsNumber++

        mainNumberText?.setText("${number}")
        currentTrial?.setText("$trialsNumber")


        if (number == initNumber) {
            Toast.makeText(this, "Gra zakończona po $trialsNumber próbach", Toast.LENGTH_LONG)
                .show()
            newGame()
        }
    }
}
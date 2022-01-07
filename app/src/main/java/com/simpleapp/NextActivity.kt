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

    var mainNumberText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_next_layout)

        //number = initNumber

        newGame()

        val binding = ActivityNextLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainNumberText = binding.mainTextView

        binding.mainTextView.setText("${number}")

        binding.buttonLeft.setOnClickListener {
            number+=9

            restartGame()
        }


        binding.buttonRight.setOnClickListener {
            number-=7

            restartGame()
        }

        binding.buttonUp.setOnClickListener {
            number+=3

            restartGame()
        }

        binding.buttonDown.setOnClickListener {
            number-=5

            restartGame()
        }

    }

    fun newGame(){
        while(number==0){
            number = Random.nextInt(-100,100)
        }
        trialsNumber = 0
    }

    fun restartGame(){
        trialsNumber++

        mainNumberText?.setText("${number}")

        if(number==initNumber){
            Toast.makeText(this,"Gra zakończona po $trialsNumber próbach",Toast.LENGTH_LONG).show()
            newGame()
        }
    }
}
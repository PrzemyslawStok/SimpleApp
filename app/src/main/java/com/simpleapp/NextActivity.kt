package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.simpleapp.databinding.ActivityNextLayoutBinding

class NextActivity : AppCompatActivity() {
    var initNumber = 0
    var number = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_next_layout)

        //number = initNumber

        val binding = ActivityNextLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainTextView.setText("${number}")

        binding.buttonLeft.setOnClickListener {
            number+=9
            binding.mainTextView.setText("${number}")

            restartGame()
        }


        binding.buttonRight.setOnClickListener {
            number-=7
            binding.mainTextView.setText("${number}")

            restartGame()
        }

        binding.buttonUp.setOnClickListener {
            number+=3
            binding.mainTextView.setText("${number}")

            restartGame()
        }

        binding.buttonDown.setOnClickListener {
            number-=5
            binding.mainTextView.setText("${number}")

            restartGame()
        }

    }

    fun restartGame(){
        if(number==initNumber){
            Toast.makeText(this,"Gra zakończona po ...",Toast.LENGTH_LONG).show()
        }
    }
}
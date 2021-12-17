package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.simpleapp.databinding.ActivityNextLayoutBinding

class NextActivity : AppCompatActivity() {
    var initNumber = 101
    var number = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_next_layout)

        number = initNumber

        val binding = ActivityNextLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainTextView.setText("${number}")

        binding.buttonLeft.setOnClickListener {
            number+=9
            binding.mainTextView.setText("${number}")
        }

    }

    fun restartGame(){
        if(number==initNumber){

        }
    }
}
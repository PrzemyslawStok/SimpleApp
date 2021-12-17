package com.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simpleapp.databinding.ActivityNextLayoutBinding

class NextActivity : AppCompatActivity() {
    var number = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_next_layout)

        val binding = ActivityNextLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainTextView.setText("${number}")

        binding.buttonLeft.setOnClickListener {
            number+=9
            binding.mainTextView.setText("${number}")
        }

    }
}
package com.simpleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.LinearLayoutCompat
import com.simpleapp.databinding.ActivityGame1Binding
import com.simpleapp.databinding.ActivityGame2Binding

class Game2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGame2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.mainLayout
        mainLayout.setBackgroundColor(Color.GRAY)
        mainLayout.removeAllViews()

    }
}
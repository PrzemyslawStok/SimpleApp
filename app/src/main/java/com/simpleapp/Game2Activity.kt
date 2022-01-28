package com.simpleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import com.simpleapp.databinding.ActivityGame1Binding
import com.simpleapp.databinding.ActivityGame2Binding

class Game2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGame2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.mainLayout

        //mainLayout.setBackgroundColor(Color.GRAY)
        mainLayout.removeAllViews()
        mainLayout.weightSum = 10.0f


        for (i in 1..10) {
            val view = View(this)
            if (i % 2 == 0)
                view.setBackgroundColor(Color.CYAN)
            else
                view.setBackgroundColor(Color.GRAY)

            val params = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.MATCH_PARENT
            )
            params.weight = 1.0f
            view.layoutParams = params

            mainLayout.addView(view)
        }


    }
}
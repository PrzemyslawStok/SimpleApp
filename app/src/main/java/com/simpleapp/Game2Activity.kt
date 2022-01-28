package com.simpleapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import com.simpleapp.databinding.ActivityGame2Binding

class Game2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGame2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.mainLayout

        //mainLayout.setBackgroundColor(Color.GRAY)
        mainLayout.removeAllViews()

        addRow(mainLayout)
    }

    fun addRow(layout: LinearLayoutCompat){
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

            layout.addView(view)
        }
    }
}
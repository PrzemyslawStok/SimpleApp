package com.simpleapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
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


        for (i in 1..10) {
            val view = View(this)
            if (i % 2 == 0)
                view.setBackgroundColor(Color.CYAN)
            else
                view.setBackgroundColor(Color.GRAY)

            view.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1.0f
            )

            mainLayout.addView(view)
        }


    }
}
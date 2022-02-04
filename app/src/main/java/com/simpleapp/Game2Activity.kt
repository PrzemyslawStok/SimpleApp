package com.simpleapp

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import com.simpleapp.databinding.ActivityGame2Binding
import com.simpleapp.databinding.ActivityGame2GridBinding
import java.util.*
import kotlin.random.Random

class Game2Activity : AppCompatActivity() {
    val gameBoardRows = 5
    val gameBoardColumns = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityGame2GridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.mainLayout
        mainLayout.rowCount = gameBoardRows
        mainLayout.columnCount = gameBoardColumns

        createGameboardArray()

        for (i in 1..gameBoardRows * gameBoardColumns) {

            val view = View(this)

            val r = Random.nextInt(0, 255)
            view.setBackgroundColor(
                Color.rgb(r, r, r)
            )

            val params = GridLayout.LayoutParams(
                GridLayout.spec(GridLayout.UNDEFINED, 1f),
                GridLayout.spec(GridLayout.UNDEFINED, 1f)
            )

            params.width = 0
            params.height = 0
            //params.setGravity(Gravity.FILL)

            mainLayout.addView(view, params)
        }


        //mainLayout.setBackgroundColor(Color.GRAY)
        //mainLayout.removeAllViews()

        //mainLayout.orientation = LinearLayoutCompat.HORIZONTAL


    }

    fun createGameboardArray() {
        //proszę utworzyć macierz 2d o rozmiarach planszy gry
    }

    fun fillGameboardArray(){
        //proszę zapełnić macierz losowymi cyframi 0,1
    }

    fun addLayout(mainLayout: LinearLayoutCompat) {
        for (i in 1..2) {
            val linearLayoutCompat = LinearLayoutCompat(this)
            if (i % 2 == 0)
                linearLayoutCompat.setBackgroundColor(Color.CYAN)
            else
                linearLayoutCompat.setBackgroundColor(Color.GRAY)

            val params = LinearLayoutCompat.LayoutParams(
                LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.MATCH_PARENT
            )

            params.weight = 1.0f

            linearLayoutCompat.layoutParams = params


            //addRow(linearLayoutCompat)
            mainLayout.addView(linearLayoutCompat)
            //addRow(linearLayoutCompat)
        }
    }

    fun addRow(layout: LinearLayoutCompat) {
        layout.orientation = LinearLayoutCompat.VERTICAL

        for (i in 1..10) {
            val view = View(this)
            if (i % 2 == 0)
                view.setBackgroundColor(Color.GREEN)
            else
                view.setBackgroundColor(Color.YELLOW)

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
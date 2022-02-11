package com.simpleapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import com.simpleapp.databinding.ActivityGame2GridBinding
import kotlin.random.Random

class Game2Activity : AppCompatActivity() {
    val gameBoardRows = 2
    val gameBoardColumns = 5

    var gameBoardArray: Array<IntArray>? = null
    var gameBoard: Array<Array<View?>>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityGame2GridBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainLayout = binding.mainLayout
        mainLayout.rowCount = gameBoardRows
        mainLayout.columnCount = gameBoardColumns

        gameBoardArray = createGameboardArray(gameBoardRows, gameBoardColumns)
        createGameboard(gameBoardRows, gameBoardColumns)

        for (i in 0..gameBoardRows * gameBoardColumns - 1) {

            val view = View(this)

            val r = Random.nextInt(0, 255)

            val row = i / gameBoardRows
            val col = i / gameBoardRows //Zad. proszę ustalić odpowiedni numer

            Log.v(
                "Game2Activity",
                "[$row][$col]"
            )
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

    fun createGameboardArray(rows: Int = 5, cols: Int = 5): Array<IntArray> {
        //proszę utworzyć macierz 2d o rozmiarach planszy gry
        //val array = arrayListOf(1, 2, 3, 4, 5)
        //val array1 = Array(rows) { it * it }

        val array2 = Array(rows) {
            IntArray(cols) {
                Random.nextInt(0, 2)
            }
        }
        logArray(array2)

        return array2
    }

    fun createGameboard(rows: Int = 5, cols: Int = 5) {
        gameBoard = Array(rows) {
            Array<View?>(cols) {
                null
            }
        }
    }

    fun logArray(array: Array<IntArray>) {
        for (row in array) {
            Log.v("Game2Activity", "${row.toList()}")
        }
    }

    fun fillGameboardArray() {
        //proszę zapełnić macierz losowymi cyframi 0,1
    }

    fun drawGameboard() {

    }
}
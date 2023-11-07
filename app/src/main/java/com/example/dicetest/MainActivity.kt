package com.example.dicetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.rollTheDice)
        val writeOutNumber = findViewById<TextView>(R.id.writeOutResult)
        val userInputSides = findViewById<EditText>(R.id.enterSidesOfDice)

        writeOutNumber.visibility = TextView.INVISIBLE

        button.setOnClickListener {
            var userInputTxt = userInputSides.text.toString()
            var sidesOfDice = userInputTxt.toInt() + 1

            val randomNumber = (1 until sidesOfDice).random()
            setResult(randomNumber.toString(), writeOutNumber)
        }
    }

    fun setResult(randomNumber : String, writeOutNumber : TextView){
        val resultText = getString(R.string.dice_result, randomNumber.toInt())
        writeOutNumber.text = resultText
        writeOutNumber.visibility = TextView.VISIBLE
    }
}
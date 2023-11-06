package com.example.dicetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var writeOutNumber : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumber = (1 until 7).random()

        setResult(randomNumber.toString())
    }

    fun setResult(randomNumber : String){
        writeOutNumber = findViewById<TextView>(R.id.writeOutResult)
        writeOutNumber.text = "Tärningen visar nummer $randomNumber"
    }
}
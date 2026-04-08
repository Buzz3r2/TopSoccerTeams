package com.example.topsoccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // array of soccer teams
    val teams = arrayOf<String>("Mamelodi Sundowns FC", "Orlando Pirates",
        "Bidvest Wits", "Stellenbosch FC", "Sek United FC")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //creating variable to hold textview text
        val teamsTxt = findViewById<TextView>(R.id.teamsTextView)

        //displaying array item in textview
        teams[0] = "Man Sundowns FC :)"
        teamsTxt.text = teams[0]


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
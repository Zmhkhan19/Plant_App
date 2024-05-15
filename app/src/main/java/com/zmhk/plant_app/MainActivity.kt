package com.zmhk.plant_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declaring variables
    private var health = 60
    private var water = 30
    private var sunlight = 60

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageViewPlant = findViewById<ImageView>(R.id.imageViewPlant)

        val btnWater = findViewById<Button>(R.id.btnWater)
        val btnFertilize = findViewById<Button>(R.id.btnFertilize)
        val btnSun = findViewById<Button>(R.id.btnSun)

        //Initialise the Sun stat
        updateUI()
        btnSun.setOnClickListener {
            sunPlant()
            updateUI()



        }

        //Initialise the Fertilize stat
        btnFertilize.setOnClickListener {
            fertilizePlant()
            updateUI()


        }

        ////Initialise the Water stat
        btnWater.setOnClickListener {
            waterPlant()
            updateUI()
        }
    }

    //Water Button
    private fun waterPlant() {
    water += 10
    sunlight -= 5
    health += 5
    }

    //Fertilize Button
    private fun fertilizePlant() {
    health += 10



    }

    //Sunlight Button
    private fun sunPlant() {
    sunlight += 10
        water -= 5
        health += 5



    }

    //updateUI Method
    private fun updateUI(){
        //Declare the 3 stats
        val textViewHealth = findViewById<TextView>(R.id.textViewHealth)
        val textViewWater = findViewById<TextView>(R.id.textViewWater)
        val textViewSunlight = findViewById<TextView>(R.id.textViewSunlight)

        //To Initialise the 3 stats
        textViewHealth.text = "Health: $health"
        textViewWater.text = "Water: $water"
        textViewSunlight.text = "Sunlight: $sunlight"


    }
}



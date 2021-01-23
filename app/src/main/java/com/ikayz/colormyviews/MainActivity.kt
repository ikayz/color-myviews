package com.ikayz.colormyviews


import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val constraintLayout = findViewById<View>(R.id.constraint_layout)
        val redButton = findViewById<Button>(R.id.red_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)

        val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText, boxFourText,
                        boxFiveText, constraintLayout, redButton, yellowButton, greenButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View) {
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        when (view.id) {
            // Set the background colour of the boxes on tap
            R.id.box_one_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)

            // Using the android colours
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

            // Buttons which are changing the colour of the boxes
            R.id.red_button -> boxThreeText.setBackgroundColor(R.color.red)
            R.id.yellow_button -> boxFourText.setBackgroundColor(R.color.yellow)
            R.id.green_button -> boxFiveText.setBackgroundColor(R.color.green)

            else -> view.setBackgroundColor(Color.CYAN)
        }
    }
}
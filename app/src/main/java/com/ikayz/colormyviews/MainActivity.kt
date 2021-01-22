package com.ikayz.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    val box_one_text = findViewById<View>(R.id.box_one_text)
    val box_two_text = findViewById<View>(R.id.box_two_text)
    val box_three_text = findViewById<View>(R.id.box_three_text)
    val box_four_text = findViewById<View>(R.id.box_four_text)
    val box_five_text = findViewById<View>(R.id.box_five_text)
    val constraint_layout = findViewById<View>(R.id.constraint_layout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text,
                        box_five_text, constraint_layout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View) {
        when (view.id) {
            // Set the background colour of the boxes on tap
            R.id.box_one_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)

            // Using the android colours
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

            // Buttons which are changing the colour of the boxes
            R.id.red_button -> box_three_text.setBackgroundColor(R.color.red)
            R.id.yellow_button -> box_four_text.setBackgroundColor(R.color.yellow)
            R.id.green_button -> box_five_text.setBackgroundColor(R.color.green)

            else -> view.setBackgroundColor(Color.CYAN)
        }
    }
}
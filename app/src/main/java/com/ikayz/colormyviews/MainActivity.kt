package com.ikayz.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val box_one_text = findViewById<View>(R.id.box_one_text)
        val box_two_text = findViewById<View>(R.id.box_two_text)
        val box_three_text = findViewById<View>(R.id.box_three_text)
        val box_four_text = findViewById<View>(R.id.box_four_text)
        val box_five_text = findViewById<View>(R.id.box_five_text)
        val constraint_layout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text,
                        box_five_text, constraint_layout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Set the background colour of the boxes on tap
            R.id.box_one_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)

            // Using the android colours
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

            else -> view.setBackgroundColor(Color.CYAN)
        }
    }
}
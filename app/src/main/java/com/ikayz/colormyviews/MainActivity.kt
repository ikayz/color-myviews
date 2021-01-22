package com.ikayz.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
    }

    private fun setListners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text)

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

        }
    }
}
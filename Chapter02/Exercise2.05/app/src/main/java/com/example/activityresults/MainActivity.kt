package com.example.activityresults

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val PICK_RAINBOW_COLOR_INTENT = 1
const val RAINBOW_COLOR_NAME = "RAINBOW_COLOR_NAME"
const val RAINBOW_COLOR = "RAINBOW_COLOR"
const val DEFAULT_COLOR = "#FFFFFF"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.submit_button).setOnClickListener {
            Intent(this, RainbowColorPickerActivity::class.java)
                .also { rainbowColorPickerIntent ->
                    startActivityForResult(
                        rainbowColorPickerIntent,
                        PICK_RAINBOW_COLOR_INTENT
                    )
                }
        }
    }


}
package com.example.jetpackfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val STAR_SIGN_ID = "STAR_SIGN_ID"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
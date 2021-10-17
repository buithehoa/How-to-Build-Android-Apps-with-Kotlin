package com.example.dynamicfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

const val STAR_SIGN_ID = "STAR_SIGN_ID"

interface StarSignListener {
    fun onSelected(id: Int)
}

class MainActivity : AppCompatActivity(), StarSignListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            findViewById<FragmentContainerView>(R.id.fragment_container)?.let {
                val listFragment = ListFragment()
                supportFragmentManager.beginTransaction().add(it.id, listFragment).commit()
            }
        }
    }

    override fun onSelected(id: Int) {
        TODO("Not yet implemented")
    }
}
package com.example.tcl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGoToButtons = findViewById<com.google.android.material.button.MaterialButton>(R.id.btnGoToButtons)
        btnGoToButtons.setOnClickListener {
             startActivity(
                 Intent(
                     this,
                     ButtonActivity::class.java
                     )
            )
        }
        }
}
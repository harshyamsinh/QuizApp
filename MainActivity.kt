package com.example.mygpscpre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val screen2=findViewById<Button>(R.id.btnGetStart)

        screen2.setOnClickListener{
            intent= Intent(applicationContext, loginScreen::class.java)
            startActivity(intent)
        }
    }
}
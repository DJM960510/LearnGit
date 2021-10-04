package com.example.learngit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var startSecond: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startSecond = findViewById(R.id.start_second)
        startSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
package com.example.helloandroidui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvMessage: TextView = findViewById(R.id.tvMessage)
        val name = intent.getStringExtra("user_name")

        tvMessage.text = if (!name.isNullOrEmpty()) {
            "Nice to meet you, $name! This is the second screen."
        } else {
            "This is the second screen."
        }
    }
}

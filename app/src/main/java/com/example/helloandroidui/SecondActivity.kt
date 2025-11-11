package com.example.helloandroidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvMessage: TextView = findViewById(R.id.tvMessage)
        val name = intent.getStringExtra("user_name")

        tvMessage.text = if (!name.isNullOrEmpty()) {
            "Nice to meet you, $name!"
        } else {
            "This is the second screen."
        }
    }
}

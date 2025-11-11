package com.yourname.helloandroidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.helloandroidui.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe: Button = findViewById(R.id.btnClickMe)

        btnClickMe.setOnClickListener {
            Toast.makeText(this, "Button clicked! 🎉", Toast.LENGTH_SHORT).show()
        }
    }
}

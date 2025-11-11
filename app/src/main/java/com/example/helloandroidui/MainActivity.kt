package com.example.helloandroidui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.helloandroidui.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe: Button = findViewById(R.id.btnClickMe)
        val btnGoToSecond: Button = findViewById(R.id.btnGoToSecond)
        val etUserName: EditText = findViewById(R.id.etUserName)

        // Improvement 3: Personalized Toast with EditText
        btnClickMe.setOnClickListener {
            val userName = etUserName.text.toString()
            if (userName.isNotEmpty()) {
                Toast.makeText(this, "Hello $userName! Button clicked! 🎉", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter your name first!", Toast.LENGTH_SHORT).show()
            }
        }



        btnGoToSecond.setOnClickListener {
            // Create an Intent to go from MainActivity -> SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
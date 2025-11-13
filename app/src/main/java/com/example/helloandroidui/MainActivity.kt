package com.example.helloandroidui  // use your actual package

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.helloandroidui.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val btnClickMe: Button = findViewById(R.id.btnClickMe)
        val btnGoToSecond: Button = findViewById(R.id.btnGoToSecond)

        // Personalized Toast
        btnClickMe.setOnClickListener {
            val name = etName.text.toString().trim()
            val message = if (name.isNotEmpty()) {
                "Hello, $name! Welcome to Android Development!"
            } else {
                "Hello! Please enter your name."
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        // Navigate to SecondActivity with Intent
        btnGoToSecond.setOnClickListener {
            val name = etName.text.toString().trim()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_name", name)
            startActivity(intent)
        }
    }
}

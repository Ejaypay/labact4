package com.example.petapp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Get Started button
        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)

        // Set the click listener to navigate to another activity
        btnGetStarted.setOnClickListener {
            // Create an Intent to start a new activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}

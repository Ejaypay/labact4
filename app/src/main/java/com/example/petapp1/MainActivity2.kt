package com.example.petapp1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.petapp1.R.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enables edge-to-edge content for this activity
        setContentView(layout.activity_main2)

        // Ensuring that the system bars (status bar, navigation bar) don't overlap the content
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Access the Button using findViewById
        val btnGetStarted: Button = findViewById(id.btnGetStarted)
        val viewAllButton2: Button = findViewById(id.viewAllButton2)
        val viewAllButton3: Button = findViewById(id.viewAllButton3)

        // Set a click listener for the viewAllButton2
        viewAllButton2.setOnClickListener {
            // Handle the "View All" button click action here
        }
        viewAllButton3.setOnClickListener {
            // Handle click for viewAllButton3
        }

        // Set a click listener for the Get Started button
        btnGetStarted.setOnClickListener {
            // Navigate to MainActivity (not MainActivity2 to avoid infinite loop)
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}

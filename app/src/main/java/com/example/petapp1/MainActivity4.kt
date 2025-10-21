package com.example.petapp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.petapp1.R.id
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enable edge-to-edge content for this activity
        setContentView(R.layout.activity_main4)

        // Ensure system bars (status bar, navigation bar) don't overlap the content
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize BottomNavigationView
        val bottomNavigationView: BottomNavigationView = findViewById(id.bottom_navigation)

        // Set default selected item (you can set any default as per your requirement)
        bottomNavigationView.selectedItemId = R.id.nav_home

        // Set the click listener for navigation items
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity2::class.java))
                    true
                }
                R.id.nav_marketplace -> {
                    // Navigate to MainActivity4 (not MainActivity3, avoid infinite loop)
                    startActivity(Intent(this, MainActivity3::class.java))
                    true
                }
                R.id.nav_settings -> {
                    true
                }
                R.id.nav_gallery -> {
                    // Navigate to another activity (MainActivity6 as an example)
                    startActivity(Intent(this, MainActivity5::class.java))
                    true
                }
                else -> false
            }
        }
    }
}

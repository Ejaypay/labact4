package com.example.petapp1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.petapp1.R.id
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        // Set window insets to ensure the system bars (status and navigation bars) do not overlap content
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize BottomNavigationView after setting the content view
        val bottomNavigationView: BottomNavigationView = findViewById(id.bottom_navigation)

        // Set default selected item
        bottomNavigationView.selectedItemId = R.id.nav_home

        // Set the click listener for navigation items
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // If already on MainActivity5, do nothing
                    true
                }
                R.id.nav_marketplace -> {
                    // Navigate to MainActivity3 (avoid navigating to MainActivity5 again)
                    startActivity(Intent(this, MainActivity3::class.java))
                    true
                }
                R.id.nav_settings -> {
                    // If already on MainActivity5, do nothing
                    true
                }
                R.id.nav_gallery -> {
                    // If already on MainActivity5, do nothing
                    true
                }
                else -> false
            }
        }
    }
}

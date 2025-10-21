package com.example.petapp1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.petapp1.R.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enables edge-to-edge content for this activity
        setContentView(R.layout.activity_main2)

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

        // Set a click listener for the "View All" buttons (you can handle actions here)
        viewAllButton2.setOnClickListener {
            // Handle the "View All" button click action here (e.g., navigate to another activity or perform an action)
        }

        viewAllButton3.setOnClickListener {
            // Handle click for viewAllButton3 (you can navigate or handle it here)
        }

        // Set a click listener for the Get Started button
        btnGetStarted.setOnClickListener {
            // Navigate to a different activity (not MainActivity2, avoid infinite loop)
            val intent = Intent(this, HomeActivity::class.java) // Replace with your desired activity
            startActivity(intent)
        }

        // Handle BottomNavigationView
        val bottomNavigationView: BottomNavigationView = findViewById(id.bottom_navigation)

        // Set default selected item (can be any ID, depending on your requirements)
        bottomNavigationView.selectedItemId = R.id.nav_home

        // Set the click listener for navigation items
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Do nothing because we are already on MainActivity2
                    true
                }
                R.id.nav_marketplace -> {
                    // Navigate to Marketplace Activity
                    startActivity(Intent(this, MainActivity3::class.java))
                    true
                }
                R.id.nav_settings -> {
                    // Navigate to Settings Activity
                    startActivity(Intent(this, MainActivity4::class.java))
                    true
                }
                R.id.nav_gallery -> {
                    // Navigate to Gallery Activity
                    startActivity(Intent(this, MainActivity5::class.java))
                    true
                }
                else -> false
            }
        }
    }
}

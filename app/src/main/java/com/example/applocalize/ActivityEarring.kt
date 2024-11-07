// ActivityEarring.kt
package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class ActivityEarring : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_earring)

        // Apply edge-to-edge insets for immersive UI
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the cart button and set click listener
        val cartButton: ImageButton = findViewById(R.id.imageButton)
        cartButton.setOnClickListener {
            // Open ActivityCart when cart button is clicked
            val intent = Intent(this, ActivityCart::class.java)
            startActivity(intent)
        }
    }
}

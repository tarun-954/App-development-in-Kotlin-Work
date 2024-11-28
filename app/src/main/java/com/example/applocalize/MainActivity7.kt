package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.applocalize.R

class MainActivity7 : AppCompatActivity() {

    private lateinit var rootLayout: RelativeLayout
    private lateinit var myImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        rootLayout = findViewById(R.id.root_layout)
        myImage = findViewById(R.id.my_image)
    }

    // Inflate the options menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    // Handle menu item clicks
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.change_color -> {
                rootLayout.setBackgroundColor(Color.parseColor("#FFBB86FC")) // Example color
                true
            }
            R.id.change_image -> {
                myImage.setImageResource(R.drawable.d2) // Replace with your drawable
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

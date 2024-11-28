package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {

    lateinit var textView: TextView // Class-level TextView property

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        textView = findViewById(R.id.textView) // Initialize TextView
        // Register the TextView for the context menu
        registerForContextMenu(textView)
    }

    // Create the context menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu_practice, menu)
    }

    // Handle context menu item clicks
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_edit_color -> {
                // Change TextView background color to red
                textView.setBackgroundColor(Color.RED)
                Toast.makeText(this, "Background color changed to red", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_edit_text -> {
                // Change TextView text
                textView.text = "Tarun Choudhary"
                Toast.makeText(this, "Text updated", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}

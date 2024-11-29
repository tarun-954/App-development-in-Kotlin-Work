package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// code for action bar


class ExamPractice9 : AppCompatActivity() {
    private lateinit var root_layout: LinearLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice9)
        supportActionBar?.title = "My actionBar"

        root_layout = findViewById(R.id.mainlayout)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu, menu)
        return true

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.dark -> {
                root_layout.setBackgroundColor(Color.BLACK);
                return true;
            }
            R.id.light -> {
                root_layout.setBackgroundColor(Color.WHITE);
                return true;
            }

            R.id.setting -> {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                return true;
            }
        }
return super.onOptionsItemSelected(item)
    }



}
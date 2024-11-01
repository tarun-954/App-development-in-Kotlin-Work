package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val startButton: Button = findViewById(R.id.start_to_signup)
        startButton.setOnClickListener {

            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)



        }
    }
}

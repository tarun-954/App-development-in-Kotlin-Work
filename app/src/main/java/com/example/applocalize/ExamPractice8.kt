package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class ExamPractice8 : AppCompatActivity() {
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_exam_practice8)

        // Initialize the root layout
        mainLayout = findViewById(R.id.main)

        // Find the button in the layout
        val button: Button = findViewById(R.id.snackbar)

        // Set up the Snackbar with a button click
        button.setOnClickListener {
            val snackbar = Snackbar.make(it, "This is the Snackbar", Snackbar.LENGTH_LONG)
            snackbar.setAction("Change Color") {
                // Change the background color of the layout
               val cset= mainLayout.setBackgroundColor(Color.YELLOW)

                Log.e("set color","hello")
            }
            snackbar.view.setBackgroundColor(Color.RED) // Change Snackbar background color
            snackbar.setTextColor(Color.BLUE) // Change Snackbar text color
            snackbar.show()
        }
    }
}

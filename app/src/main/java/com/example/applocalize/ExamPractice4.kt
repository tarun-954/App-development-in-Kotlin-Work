package com.example.applocalize

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class ExamPractice4 : AppCompatActivity() {
    private var selectedLanguage: String? = null;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice4)


        val radiogroup: RadioGroup = findViewById(R.id.radiogroupID)
        val textview: TextView = findViewById(R.id.textviewID)
        radiogroup.setOnCheckedChangeListener { _, position ->
            selectedLanguage = when (position) {
                R.id.radiobutton1 -> "Hindi"
                R.id.radioButton2 -> "Spanish"
                R.id.radioButton3 -> "German"
                else -> null
            }


            val changebutton: Button = findViewById(R.id.changebutton)

            changebutton.setOnClickListener {
                if (selectedLanguage != null) {
                    chanageLanguage(selectedLanguage!!)
                    textview.text = getString(R.string.text)

                } else {
                    Toast.makeText(
                        this@ExamPractice4,
                        "Please select the language first !!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }

    }


    private fun chanageLanguage(language:String){
        val locale = when(language){
            "Hindi" -> Locale("hi")
            "Spanish" -> Locale("es")
            "German"->Locale("de")
            else -> Locale.getDefault()
        }

        val config=Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config,resources.displayMetrics)
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

    }


}
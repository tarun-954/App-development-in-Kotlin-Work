package com.example.applocalize

import android.content.res.Configuration
import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView;
import android.widget.Toast
import org.intellij.lang.annotations.Language
import java.util.Locale

class ExamPractice3 : AppCompatActivity() {
    private var selecteditem:String?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice3)


        val textview: TextView = findViewById(R.id.textView)
        val spinner: Spinner = findViewById(R.id.SpinnerID)
        val listitems = listOf("Hindi", "Spanish", "German")
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, listitems);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter2;
spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
    override fun onItemSelected(p0: AdapterView<*>?
                                , p1: View?,
                                position: Int,
                                p3: Long
    ) {
        selecteditem=listitems[position]
        Toast.makeText(this@ExamPractice3,"Langauge selected : $selecteditem",Toast.LENGTH_LONG).show()

        if (selecteditem!=null){
            changeLanguage(selecteditem!!)
            textview.text=getString(R.string.text)

        }


           }
    override fun onNothingSelected(parent: AdapterView<*>){
        Toast.makeText(this@ExamPractice3,"please select a langauge",Toast.LENGTH_LONG).show()

    }



        }

    }

    private fun changeLanguage(language: String) {
        val locale = when (language){
            "Hindi"->Locale("hi")
            "Spanish"->Locale("es")
            "German"->Locale("de")
                else -> Locale.getDefault()
        }
val config=Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config,resources.displayMetrics)
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)
    }


}
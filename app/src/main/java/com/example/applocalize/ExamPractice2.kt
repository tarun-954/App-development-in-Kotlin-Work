package com.example.applocalize

import android.content.res.Configuration
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ListView;
import android.widget.Toast

import android.widget.TextView;
import java.util.Locale

class ExamPractice2 : AppCompatActivity() {
    private var selecteditem:String?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice2)
// take the text view from the xml page
        val listview: ListView = findViewById(R.id.listviewID2)

        // create a list of items to use in the list view
        val listitems = listOf("Hindi", "Spanish", "German")


//        create a adapter  and add the list of items to the adapter
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, listitems)

//        now combine the listview to the adapter in which list of items are merged
        listview.adapter = adapter2


        // now set the listview listener to check the position
        listview.setOnItemClickListener { _, _, position, _ ->
            selecteditem = listitems[position]; // store the language selected
            // create a toast to tell the language selected
            Toast.makeText(
                this@ExamPractice2,
                "Language Selected: $selecteditem",
                Toast.LENGTH_LONG
            ).show()


        }
        val translatedtext: TextView = findViewById(R.id.translatedtext)
        val changebutton: Button = findViewById(R.id.changelanguage)


        //when i click on the change button the then change the translatetext textview
        changebutton.setOnClickListener {
            if (selecteditem != null) {
                changeLanguage(selecteditem!!)
                translatedtext.text = getString(R.string.text)

            } else {
                Toast.makeText(this@ExamPractice2, "Please select the langauge", Toast.LENGTH_LONG)
                    .show()
            }


        }
    }

        // change the langauge using locale and create the function to change language
        private fun changeLanguage(language:String){
            val locale=when(language){
                "Hindi" -> Locale("hi")  // hindi
                "Spanish" -> Locale("es") // spanish
                "German" ->Locale("de") // german

             else ->
                Locale.getDefault()

            }
            val config=Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config,resources.displayMetrics)
            baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)


        }



}
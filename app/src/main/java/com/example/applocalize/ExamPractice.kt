package com.example.applocalize

import android.os.Bundle
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Adapter;
import android.widget.ListView
import android.widget.Toast;

class ExamPractice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice)

        // creating a variable to use spinner from the main activity
        val spinner : Spinner =findViewById(R.id.Spinner);


        // creating the option to use in the spinner
        val options=listOf("India ","USA","Australia","China","Sri lanka","Brazil")

        // create a adapter with both spinner and option to use it combined
        val adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,options);


        //specify the layout for drop down menu
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // apply the adapter to spinner
        spinner.adapter = adapter

        spinner.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent:AdapterView<*>?,
                view: android.view.View?,
                position:Int,
                id:Long
            )
            {
                //get the selected option
                    val selectedOption=options[position]
                Toast.makeText(this@ExamPractice,"selected: $selectedOption",Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Optional: Handle no selection
                Toast.makeText(this@ExamPractice,"Please select any option",Toast.LENGTH_LONG).show()

            }
        }


val listview:ListView=findViewById(R.id.listviewID)
        val listitems=listOf("CSE224","CSE252","INT222","CSE306");
        val adapter2=ArrayAdapter(this,android.R.layout.simple_list_item_1,listitems);
            listview.adapter=adapter2

        listview.setOnItemClickListener{_,_,position,_ ->
            val selectedItem=listitems[position]
//            Toast.makeText(this@ExamPractice)

        }



        //complete the code please for practice

    }
}
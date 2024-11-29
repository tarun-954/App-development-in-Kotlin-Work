package com.example.applocalize

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.widget.Button;

//<!--    design an activity using relative layout where provide the approprete component to read the name and mobile-->
//<!--    // from the user  provide a call button when presed open the dialer to dial the entered number-->
//<!--    // using the implecit intent and show the name in toast calling xyz-->

class ExamPractice5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice5)



        val name:EditText=findViewById(R.id.nameID)
        val phone:EditText=findViewById(R.id.phoneID)

        val sendbutton:Button=findViewById(R.id.senddata)
        sendbutton.setOnClickListener{

        val sname=name.text.toString().trim()
        val sphone=phone.text.toString().trim()
        if(sname.isEmpty()|| sphone.isEmpty()){
            Toast.makeText(this@ExamPractice5,"Please enter a valid name and phone number !",Toast.LENGTH_LONG).show();


        }
        else{

            Toast.makeText(this@ExamPractice5,"Calling $sname",Toast.LENGTH_LONG).show()


            var intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$sphone")

            }
            startActivity(intent);

        }
        }



    }
}
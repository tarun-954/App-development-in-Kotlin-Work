package com.example.applocalize

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExamPractice7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice7)

        // create a code to explicit intent to send the data to new page and display the content there

        var nameID:EditText=findViewById(R.id.nameID)
        var ageID:EditText=findViewById(R.id.ageID)
        var sexID:EditText=findViewById(R.id.sexID);
        var addressID:EditText=findViewById(R.id.addressID);






        var button:Button=findViewById(R.id.button);

        button.setOnClickListener{


            var name=nameID.text.toString().trim();
            var age =ageID.text.toString().trim();
            var sex=sexID.text.toString().trim();
            var address=addressID.text.toString().trim();

            if(name.isEmpty() || age.isEmpty() || sex.isEmpty() || address.isEmpty()){
                Toast.makeText(this@ExamPractice7,"Please enter all the fields",Toast.LENGTH_SHORT).show()

            }
            else{

             Toast.makeText(this@ExamPractice7,"Sending data...",Toast.LENGTH_LONG).show()
                var intent= Intent(this,ActivityGemstone::class.java)
                intent.putExtra("data",name+"\n"+age+"\n"+sex+"\n"+address)
                startActivityForResult(intent ,100)
            }
        }



    }
}
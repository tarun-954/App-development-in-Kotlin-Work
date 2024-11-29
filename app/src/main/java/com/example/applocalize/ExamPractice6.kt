package com.example.applocalize

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExamPractice6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice6)

        val dailbutton: Button = findViewById(R.id.dialerbutton);
        val urlbutton: Button = findViewById(R.id.urlbutton);
        val senddata:Button=findViewById(R.id.senddatabutton);
        val openLocation:Button=findViewById(R.id.locationbutton);

        dailbutton.setOnClickListener {
            var intent = Intent(Intent.ACTION_DIAL);
            intent.data = Uri.parse("tel:+91 9805394341")
            startActivity(intent)

        }
        // CODE FOR URL TO ANOTHER WEBSITE

        urlbutton.setOnClickListener {
            var intent2 = Intent(Intent.ACTION_VIEW);
            intent2.data = Uri.parse("https://www.google.com")
            startActivity(intent2);
        }


        //CODE TO SEND SMS USING THE BUTTON

        senddata.setOnClickListener{
            val intent3=Intent(Intent.ACTION_VIEW);
            intent3.data=Uri.parse("sms:+91 9805394341")
            intent3.putExtra("sms_body","Hello my name is tarun choudhary");
startActivity(intent3);
        }


        // code to open the location
        openLocation.setOnClickListener{
            val intent4=Intent(Intent.ACTION_VIEW)
            intent4.data=Uri.parse("https://maps.app.goo.gl/Go3DfdDy8WM6VfXN8")
            startActivity(intent4)
        }



    }
}
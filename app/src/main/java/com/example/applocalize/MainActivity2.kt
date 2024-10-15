    package com.example.applocalize

    import android.annotation.SuppressLint
    import android.os.Bundle
    import androidx.activity.enableEdgeToEdge
    import androidx.appcompat.app.AppCompatActivity
    import androidx.core.view.ViewCompat
    import androidx.core.view.WindowInsetsCompat
    import android.widget.Button
    import android.content.Intent
    import android.net.Uri
    import android.widget.Toast
    import com.google.android.material.snackbar.Snackbar

    class MainActivity2 : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main2)
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }


    //        this is the code for explecit

            val explicit_button=findViewById<Button>(R.id.button3);
            explicit_button.setOnClickListener{
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)

            }

    //        code for impicit
    //        action view
    //        action dial
    //        action send  -> send the message to somebody
    //        action setting






    //code for implicit using action view
var implicit_btn=findViewById<Button>(R.id.button4)
            implicit_btn.setOnClickListener{
                var url="https://www.youtube.com"
                val intent=Intent(Intent.ACTION_VIEW)
                intent.data= Uri.parse(url)
                startActivity(intent);
            }


//           impicit using action dial
var implicitDialar=findViewById<Button>(R.id.button5)
            implicitDialar.setOnClickListener{
                val phonenumber="+91 9805394341"
                val intent=Intent(Intent.ACTION_DIAL)
                intent.data=Uri.parse("tel:$phonenumber");
                startActivity(intent);
            }

val sendsmsbutton=findViewById<Button>(R.id.button6)
            sendsmsbutton.setOnClickListener{
                val shareIntent=Intent(Intent.ACTION_SEND)
//                shareIntent
            }


            val testToast=findViewById<Button>(R.id.toastTest)
            testToast.setOnClickListener{ view ->
                val time=10;

                var toast_time=Toast.makeText(this, "Oops You clicked a toast button", Toast.LENGTH_LONG).show();

//               H.W
//how to set timer in toast


            }




        }
    }
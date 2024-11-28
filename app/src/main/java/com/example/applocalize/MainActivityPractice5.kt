package com.example.applocalize

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat

class MainActivityPractice5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_practice5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showAlert();
        showCustomAlert();
    }

    @SuppressLint("MissingInflatedId")
    private fun showCustomAlert() {
        val dialogView=LayoutInflater.from(this).inflate(R.layout.activity_main_practice5,null)
        val l1=LayoutInflater.from(this).inflate(R.layout.constom_alert,null)

        val dialogTitle=dialogView.findViewById<TextView>(R.id.alertTitle)
        val dialogmessage=dialogView.findViewById<TextView>(R.id.textView13)
        val btnok=dialogView.findViewById<Button>(R.id.button8);
        val btnno=dialogView.findViewById<Button>(R.id.button9)

        val dialog=AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false)
            .create()
        btnok.setOnClickListener{
            dialog.dismiss()
        }
        btnno.setOnClickListener{
            finish()
        }
        dialog.show()


    }







    private fun showAlert() {
       val builder=AlertDialog.Builder(this)
        builder.setTitle("This is an Alert Box");
        builder.setMessage("Would you like to continue or not? ");
        builder.setPositiveButton("Ok"){dialog, _ ->
            dialog.dismiss();
        }

        builder.setNegativeButton("Cancel"){dialog, _ ->
            dialog.dismiss();
        }
        val alertDialog=builder.create()
        alertDialog.show();
    }

//    val alertbutton=findViewById<Button>(R.id.button7)
//    private fun OnClickListener{
//        alertbutton.showAlert()
        
//    }







}

//        val btn=findViewById<Button>(R.id.button10);
//        btn.setOnClickListener(){view->
//            showPopupMenu(view)

//
//         val textView=findViewById<TextView>(R.id.textview)
//        val imageView=findViewById<ImageView>(R.id.imageView)
//        registerForContextMenu(imageView)
//        }
//
//    }

//fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
//    onCreateContextMenu(menu, v, menuInfo)

    // Inflate the context menu using menuInflater
//    val inflater: MenuInflater = menuInflater
//    inflater.inflate(R.menu.contextmenu, menu) // Inflate your context menu XML






//    private fun showPopupMenu(view: View){
//            val popupMenu=PopupMenu(this,view)
//        popupMenu.menuInflater.inflate(R.menu.popupmenu,popupMenu.menu)
//
//popupMenu.show()
//        popupMenu.setOnMenuItemClickListener { item ->
//
//            when (item.itemId) {
//                R.id.edit -> {
//                    val btnChangeText = findViewById<Button>(R.id.button10)
//
//                    true
//                }
//
//                else -> false
//            }
//        }
//    }

//pressing  longer on  the image view then chnage the color of the image
//    when user is clicking on the button he has to get the pop up menu to chnage the text view
//    in the option meanu go to the next page send the text to the next page

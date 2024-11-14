package com.example.applocalize

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
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
//        val btn=findViewById<Button>(R.id.button10);
//        btn.setOnClickListener(){view->
//            showPopupMenu(view)


         val textView=findViewById<TextView>(R.id.textview)
        val imageView=findViewById<ImageView>(R.id.imageView)
        registerForContextMenu(imageView)
        }

    }

fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
    onCreateContextMenu(menu, v, menuInfo)

    // Inflate the context menu using menuInflater
    val inflater: MenuInflater = menuInflater
    inflater.inflate(R.menu.contextmenu, menu) // Inflate your context menu XML
}





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

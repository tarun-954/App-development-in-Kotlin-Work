package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
       val constraintlayout:ConstraintLayout=findViewById(R.id.constraintlayout)
        val imageview: ImageView =findViewById(R.id.ChangeImage)
        val showmenuButton: Button =findViewById(R.id.popupbutton)

        showmenuButton.setOnClickListener{
            val popupmenu=PopupMenu(this,showmenuButton)
            val inflater:MenuInflater=popupmenu.menuInflater
            inflater.inflate(R.menu.popup_menu_practice,popupmenu.menu)


            popupmenu.setOnMenuItemClickListener { menuItem: MenuItem->
                when(menuItem.itemId){
                    R.id.changebgcolor->{
                        constraintlayout.setBackgroundColor(Color.parseColor("#FFBB86FC"))
                        true
                    }
                    R.id.changeImage->{
                        imageview.setImageResource(R.drawable.d5)
                        true
                    }
                    else -> false
            }

            }
            popupmenu.show()
        }








    }
}
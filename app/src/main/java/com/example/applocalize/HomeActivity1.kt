package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class HomeActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)

        setupCardNavigation(R.id.clothingCard, ActivityEarring::class.java)
        setupCardNavigation(R.id.elecName, ActivityNeckless::class.java)
        setupCardNavigation(R.id.diamondcard, ActivityDiamond::class.java)
        setupCardNavigation(R.id.silverJewelryCard, ActivitySilverJewelry::class.java)
        setupCardNavigation(R.id.gemstoneCard, ActivityGemstone::class.java)
        setupCardNavigation(R.id.braceletCard, ActivityBracelet::class.java)
    }

    private fun setupCardNavigation(cardViewId: Int, activityClass: Class<*>) {
        try {
            findViewById<CardView>(cardViewId)?.setOnClickListener {
                val intent = Intent(this, activityClass)
                startActivity(intent)
            }
        } catch (e: Exception) {
            Log.e("HomeActivity1", "Error setting up navigation for ${activityClass.simpleName}", e)
            Toast.makeText(this, "Error opening ${activityClass.simpleName}", Toast.LENGTH_SHORT).show()
        }
    }
}

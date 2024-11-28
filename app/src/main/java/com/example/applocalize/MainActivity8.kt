package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)

        val textview: TextView = findViewById(R.id.textView16)
        textview.text = "Main activity"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ca_option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.send -> {
                showConfirmationDialog()
                true
            }
            R.id.Exit ->{
                showConfirmationexitDialog()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun showConfirmationexitDialog() {
        AlertDialog.Builder(this)
            .setTitle("Confirm Navigation")
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("Yes") { _, _ ->

                finishAffinity()
                System.exit(0);
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss();
            }
            .show();
    }

    private fun showConfirmationDialog() {
        AlertDialog.Builder(this)
            .setTitle("Confirm Navigation")
            .setMessage("Are you sure you want to navigate to the new page?")
            .setPositiveButton("Yes") { _, _ ->

                val intent = Intent(this, ActivityEarring::class.java)
                startActivity(intent)
            }
            .setNegativeButton("No") { dialog, _ ->
                dialog.dismiss();
            }
            .show();
    }
}

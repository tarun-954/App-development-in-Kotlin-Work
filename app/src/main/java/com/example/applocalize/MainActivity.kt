package com.example.applocalize

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat;
import android.content.pm.PackageManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enables edge-to-edge layout
        setContentView(R.layout.activity_main)

        // Find the button in the layout
        val showSnackbarButton: Button = findViewById(R.id.btnsnackbar1)

        // Set up an OnClickListener for the button
        showSnackbarButton.setOnClickListener { view ->
            // Create and show the Snackbar
            val snackbar = Snackbar.make(view, "This is my Snackbar message", Snackbar.LENGTH_LONG)
            snackbar.setAction("Close") {
                Log.e("MainActivity", "Snackbar closed")
            }
            snackbar.setBackgroundTint(Color.BLUE);
            snackbar.show()



        }
        private val permissions= arrayOf(
    Manifest.permission.CAMERA;
            Manifest.permission.
        )
    }
}

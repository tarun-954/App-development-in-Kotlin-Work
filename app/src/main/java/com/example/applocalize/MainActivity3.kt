package com.example.applocalize

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity3 : AppCompatActivity() {

    private val permissions = arrayOf(
        Manifest.permission.CAMERA,
        Manifest.permission.ACCESS_FINE_LOCATION
    )

    private val PERMISSION_REQUEST_CODE = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        // Check permissions and request if not granted
        if (!hasPermissions()) {
            ActivityCompat.requestPermissions(this, permissions, PERMISSION_REQUEST_CODE)
        } else {
            Toast.makeText(this, "Permissions already granted", Toast.LENGTH_SHORT).show()
            accessLocation()
            accessCamera()
        }

        // Button to navigate to MainActivity4
        val startButton: Button = findViewById(R.id.start_to_signup)
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }

    // Function to check if all permissions are granted
    private fun hasPermissions(): Boolean {
        return permissions.all { permission ->
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }

    // Handle the result of the permissions request
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
                Toast.makeText(this, "Permissions granted", Toast.LENGTH_SHORT).show()
                accessLocation()
                accessCamera()
            } else {
                Toast.makeText(this, "Permissions denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to access location (placeholder for actual location functionality)
    private fun accessLocation() {
        Toast.makeText(this, "Accessing location...", Toast.LENGTH_LONG).show()
    }

    // Function to access camera (placeholder for actual camera functionality)
    private fun accessCamera() {
        Toast.makeText(this, "Accessing camera...", Toast.LENGTH_LONG).show()
    }

    // Function to enable edge-to-edge display (placeholder)
    private fun enableEdgeToEdge() {
        // Define any edge-to-edge UI settings if needed
    }
}



//    private val locationPermissionLauncher = registerForActivityResult(
//        ActivityResultContracts.RequestPermission()
//    ) { isGranted: Boolean ->
//        if (isGranted) {
//            accessLocation()
//        } else {
//            Toast.makeText(this, "Location permission is required to start the application", Toast.LENGTH_LONG).show()
//        }
//    }
//
//    private val cameraPermissionLauncher = registerForActivityResult(
//        ActivityResultContracts.RequestPermission()
//    ) { isGranted: Boolean ->
//        if (isGranted) {
//            accessCamera()
//        } else {
//            Toast.makeText(this, "Camera permission is required to start the application", Toast.LENGTH_LONG).show()
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle1?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main3)

//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            requestLocationPermission()
//        } else {
//            accessLocation()
//        }

//        // request camera permission
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//            requestCameraPermission()
//        } else {
//            accessCamera()
//        }



//    private fun requestLocationPermission() {
//        locationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
//    }
//
//    private fun requestCameraPermission() {
//        cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
//    }
////
//    private fun accessLocation() {
//        // location
//        Toast.makeText(this, "Accessing location...", Toast.LENGTH_LONG).show()
//    }
//
//    private fun accessCamera() {
//        //camera
//        Toast.makeText(this, "Accessing camera...", Toast.LENGTH_LONG).show()
//    }

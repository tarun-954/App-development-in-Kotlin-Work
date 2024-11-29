package com.example.applocalize

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import android.Manifest
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class ExamPractice10 : AppCompatActivity() {
private val REQUEST_CAMERA_CODE=111;
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_exam_practice10)

        // check if the permission is granted or not
//        if not the request
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA)!=PackageManager.PERMISSION_GRANTED){
            // request permission
            ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.CAMERA),REQUEST_CAMERA_CODE);
        }
        else{
            Toast.makeText(this@ExamPractice10,"Permission is already granted",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==REQUEST_CAMERA_CODE){
            if(grantResults.isNotEmpty()&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
//             val snackbar=Snackbar.make(it,"Permission is granted",Snackbar.LENGTH_LONG)
//                snackbar.show()
                Toast.makeText(this@ExamPractice10,"Permission granted...",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this@ExamPractice10,"Permission not granted . ",Toast.LENGTH_SHORT).show();

            }
        }

    }
}
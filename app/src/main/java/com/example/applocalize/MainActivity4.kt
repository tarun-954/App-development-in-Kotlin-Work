package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        // Initialize views
        val loginButton = findViewById<Button>(R.id.start_to_signup)
        val signUpLink = findViewById<TextView>(R.id.textView11)
        val emailInput = findViewById<EditText>(R.id.usernameInput)
        val passwordInput = findViewById<EditText>(R.id.usernameInput2)

        // Set onClickListener for login button

        loginButton.setOnClickListener {

            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (validateInputs(email, password)) {
                // Proceed with login if inputs are valid
                val intent = Intent(this, HomeActivity1 ::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }

        // Set onClickListener for sign up link
        signUpLink.setOnClickListener {

            // Navigate to Sign-Up activity
            val intent = Intent(this, MainActivitySignUp5::class.java)
            startActivity(intent)

        }
    }

    // Function to validate email and password
    private fun validateInputs(email: String, password: String): Boolean {
        if (email.isEmpty()) {

            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
            return false
        }

        if (password.isEmpty())
        {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
            return false
        }
        else if (password.length < 6)
        {
            Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
}



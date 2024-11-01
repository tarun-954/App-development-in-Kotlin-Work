package com.example.applocalize

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivitySignUp5 : AppCompatActivity() {

    private lateinit var usernameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var signUpButton: Button
    private lateinit var signInLink: TextView // Declare sign-in link

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sign_up5)

        // Initialize views
        usernameInput = findViewById(R.id.usernameInput)
        emailInput = findViewById(R.id.usernameInput2)
        passwordInput = findViewById(R.id.usernameInput3)
        signUpButton = findViewById(R.id.start_to_signup)
        signInLink = findViewById(R.id.textView15) // Initialize sign-in link

        // Set up the sign-up button click listener
        signUpButton.setOnClickListener {
            // Validate user input here
            val username = usernameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (validateInputs(username, email, password)) {
                // If validation passes, proceed to HomeActivity
                navigateToHome()
                Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_SHORT).show()
            }
        }

        // Set up the sign-in link click listener
        signInLink.setOnClickListener {
            // Navigate to sign-in activity
            val intent = Intent(this, MainActivity4::class.java) // Assuming MainActivity4 is the sign-in activity
            startActivity(intent)
            finish() // Optional: finish sign-up activity
        }
    }

    private fun validateInputs(username: String, email: String, password: String): Boolean {
        if (username.isEmpty()) {
            Toast.makeText(this, "Please enter your username", Toast.LENGTH_SHORT).show()
            return false
        }

        if (email.isEmpty()) {
            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            return false
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
            return false
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Please enter your password", Toast.LENGTH_SHORT).show()
            return false
        } else if (password.length < 6) {
            Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity1::class.java)
        startActivity(intent)
        finish() // Finish sign-up activity so the user cannot go back to the sign-up screen
    }
}

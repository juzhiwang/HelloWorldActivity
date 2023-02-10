package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Hellp
    // Declare view properties
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views defined in Layout
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)
        
        // Respond to button click event
        clickMeButton.setOnClickListener{

            /* Write your code here */

            displayTextView.text = "Write code to print a greeting with the entered name when the button is clicked"

        }

    }
}
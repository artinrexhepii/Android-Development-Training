package com.example.class2_challenge

import android.content.Intent
import android.os.Bundle
import android.telecom.Call.Details
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.name_edittext)
        val surnameEditText = findViewById<EditText>(R.id.surname_edittext)
        val phoneEditText = findViewById<EditText>(R.id.phone_edittext)
        val birthdateEditText = findViewById<EditText>(R.id.birthdate_edittext)
        val registerButton = findViewById<Button>(R.id.register_button)

        registerButton.setOnClickListener{
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(KEY_NAME, nameEditText.text.toString())
            intent.putExtra(KEY_SURNAME, surnameEditText.text.toString())
            intent.putExtra(KEY_PHONE, phoneEditText.text.toString())
            intent.putExtra(KEY_BIRTHDATE, birthdateEditText.text.toString())
            startActivity(intent)
        }
        }
    }

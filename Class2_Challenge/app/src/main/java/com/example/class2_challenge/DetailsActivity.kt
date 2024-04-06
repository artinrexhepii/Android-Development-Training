package com.example.class2_challenge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val nameTextView = findViewById<TextView>(R.id.name_textview)
        val surnameTextView = findViewById<TextView>(R.id.surname_textview)
        val phoneTextView = findViewById<TextView>(R.id.phone_textview)
        val birthdateTextView = findViewById<TextView>(R.id.birthdate_textview)
        val callButton = findViewById<ImageButton>(R.id.call_button)

        val name = intent.extras?.getString(KEY_NAME)
        val surname = intent.extras?.getString(KEY_SURNAME)
        val phone = intent.extras?.getString(KEY_PHONE)
        val birthdate = intent.extras?.getString(KEY_BIRTHDATE)

        nameTextView.text ="Emri: $name"
        surnameTextView.text= "Mbiemri: $surname"
        phoneTextView.text="Numri: $phone"
        birthdateTextView.text="Ditelindja: $birthdate"

        callButton.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel: $phone")
            startActivity(dialIntent)

        }
    }
}
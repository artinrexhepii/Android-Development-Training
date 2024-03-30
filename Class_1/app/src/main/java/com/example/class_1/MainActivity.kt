package com.example.class_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    lateinit var sumEditText: EditText
    lateinit var timeEditText: EditText
    lateinit var rateEditText: EditText
    val calculator = LoanCalculator()
    override fun onCreate(savedInstanceState: Bundle?) {
        //        val emailEditText = findViewById<EditText>(R.id.email_edittext)
//        val passwordEditText = findViewById<EditText>(R.id.password_edittext)
//        val loginButton = findViewById<Button>(R.id.login_button)
//        loginButton.setOnClickListener {
//            if (emailEditText.text.isNotBlank() && passwordEditText.text.isNotBlank()) {
//                println("Email is: ${emailEditText.text}")
//                println("Password is: ${passwordEditText.text}")
//            } else {
//                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
//            }
//            println("Login button clicked")
//        }
//
//        emailEditText.doOnTextChanged { text, start, before, count ->
//            if (text != null) {
//                loginButton.isEnabled = text.isNotBlank() && passwordEditText.text.isNotBlank()
//            }
//        }
//        passwordEditText.doOnTextChanged { text, start, before, count ->
//            loginButton.isEnabled = text!!.isNotBlank() && emailEditText.text.isNotBlank()
//        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        sumEditText = findViewById<EditText>(R.id.sum_edittext)
        sumEditText.doOnTextChanged {text, start, before, count -> calculator.setAmount(text) }
        timeEditText = findViewById<EditText>(R.id.time_edittext)
        timeEditText.doOnTextChanged{text, start, before, count -> calculator.setSpan(text) }
        rateEditText = findViewById<EditText>(R.id.rate_edittext)
        rateEditText.doOnTextChanged{text, start, before, count -> calculator.setInterest(text) }
        val rateTextView = findViewById<TextView>(R.id.rate_textview)
        val totalTextView = findViewById<TextView>(R.id.total_textview)
        val calculateButton = findViewById<Button>(R.id.calculate_button)


        calculateButton.setOnClickListener{
//            calculator.span = getTime()
//            calculator.interest = getRate()
//            calculator.amount = getSum()
            rateTextView.text= "Rata mujore ${calculator.calculateMonthlyPayment()}"
            totalTextView.text = "Totali per kthim: ${calculator.calculateTotal()}"
        }

    }

//    fun getSum(): Double {
//        return sumEditText.text.toString().toDouble()
//    }
//
//    fun getTime(): Double {
//        return timeEditText.text.toString().toDouble()
//    }
//
//    fun getRate(): Double {
//        return (rateEditText.text.toString().toDouble() / 12) / 100
//    }
}
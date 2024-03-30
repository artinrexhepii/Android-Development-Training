package com.example.class_1

import android.text.Editable
import java.math.RoundingMode

class LoanCalculator {
    private var amount = 0.0
    fun setAmount(text: CharSequence?){
        amount = text.toString().toDouble()
    }
    private var span = 0.0
    fun setSpan(text: CharSequence?){
        span = text.toString().toDouble()
    }
    private var interest = 0.0
    fun setInterest(text: CharSequence?){
        interest = (text.toString().toDouble()/12)/100
    }

    fun calculateMonthlyPayment(): Double {
        val result = amount*(interest * Math.pow(1+ interest, span)) / (Math.pow(1+interest, span) - 1)
        return result.toBigDecimal().setScale(1, RoundingMode.UP).toDouble()
    }

    fun calculateTotal(): Double {
        return (calculateMonthlyPayment() * span).toBigDecimal().setScale(1, RoundingMode.UP).toDouble();
    }
}
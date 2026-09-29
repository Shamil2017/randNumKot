package com.example.randnumkot

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var txtNumber: TextView
    private lateinit var btnNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtNumber = findViewById(R.id.txtNumber)
        btnNumber = findViewById(R.id.btnNumber)

    }
   

    fun newNumber(view: View) {
        val number = (1..100).random()
        txtNumber.text = number.toString()
        btnNumber.setText("Нажми еще раз для нового числа")
    }
}
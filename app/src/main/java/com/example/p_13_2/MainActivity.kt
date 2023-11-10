package com.example.p_13_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        editTextNumber.requestFocus()
    }

    fun buttonOnClick(view: View) {
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        if (editTextNumber.text.toString() == "") {
            editTextNumber.requestFocus()
        } else if (editTextNumber2.text.toString() == "") {
            Toast.makeText(this, "Введите 1-ый катет ! ", Toast.LENGTH_SHORT).show()
            editTextNumber2.requestFocus()
        } else if (editTextNumber2.text.toString() == "") {
            Toast.makeText(this, "Введите 2-ый катет !", Toast.LENGTH_SHORT).show()
            editTextNumber2.requestFocus()
        } else {
            val cathetus1: Double = editTextNumber!!.text.toString().toDouble()
            val cathetus2: Double = editTextNumber2!!.text.toString().toDouble()
            textView.setText((cathetus1 * cathetus2 * 0.5).toString())
            textView2.setText((cathetus1 * cathetus1 + Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2)).toString())
            textView3.setText(
                (Math.sqrt((cathetus1 * cathetus1 + cathetus2 * cathetus2)).toString())
            )

        }

    }
}
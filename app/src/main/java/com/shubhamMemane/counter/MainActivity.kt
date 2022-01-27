package com.shubhamMemane.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.Constraints.TAG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButtonView = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.myTextView)

        var clicked = 0;

        myButtonView.setOnClickListener {
            clicked += 1;

            myTextView.text = clicked.toString()

            Toast.makeText(this,"Clicked Me" , Toast.LENGTH_LONG).show()

        }

    }


}
package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            var intent=Intent(baseContext,signup::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            Toast.makeText(baseContext,"Welcome", Toast.LENGTH_SHORT).show()
        }

    }
}
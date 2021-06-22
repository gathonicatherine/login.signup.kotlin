package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class signup : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button5:Button
    lateinit var etname:EditText
    lateinit var spgender:Spinner
    lateinit var EtEmail:EditText
    lateinit var EtPassword:EditText
    lateinit var Etphonenumber:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        buttons()
    }
    fun castView(){
        etname =findViewById(R.id.etname)
        spgender =findViewById(R.id.spgender)
        EtEmail =findViewById(R.id.EtEmail)
        Etphonenumber = findViewById(R.id.Etphonenumber)
        EtPassword=findViewById(R.id.EtPassword)
        setContentView(R.layout.activity_signup)
        button4=findViewById(R.id.button4)
        button4=findViewById(R.id.button5)
        var genders= arrayOf("Female","Male","Others")
        var gendersAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,genders)
        gendersAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter=gendersAdapter

        }

    fun buttons() {
        button4.setOnClickListener {
            var intent = Intent(baseContext, signup::class.java)
            startActivity(intent)

        }
        button5.setOnClickListener {
            Toast.makeText(baseContext,"Welcome", Toast.LENGTH_SHORT).show()
        }

    }
}

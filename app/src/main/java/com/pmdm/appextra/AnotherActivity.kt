package com.example.appmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.pmdm.appextra.R

class AnotherActivity : AppCompatActivity() {

    private lateinit var sal : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        initComponents()
        initUI()
    }

    private fun initComponents() {
        sal = findViewById(R.id.saludo)
    }

    private fun initUI() {
        val saludo2:String = "Hola esto es la actividad del botón 1"
        val saludo:String = intent.extras?.getString("SALUDOS $saludo2").orEmpty()
        sal.text = "SALUDOS $saludo2"
    }

}
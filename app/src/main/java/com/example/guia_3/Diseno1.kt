package com.example.guia_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Diseno1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diseno1)

        val BotonDiseño = findViewById<Button>(R.id.BotonDiseño1)

        BotonDiseño.setOnClickListener{
            val Boton = Intent(this, Diseno2::class.java)

            startActivity(Boton)

        }
    }
}
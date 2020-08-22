package com.example.guia_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Diseno2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diseno2)

        val BotonDiseño = findViewById<Button>(R.id.BotonDiseño2)

        BotonDiseño.setOnClickListener{
            val Boton = Intent(this, Diseno1::class.java)

            startActivity(Boton)

        }
    }
}
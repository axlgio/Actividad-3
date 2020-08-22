package com.example.guia_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)


        val BotonPagar = findViewById<Button>(R.id.BotonPagar)
        val NTarjeta = findViewById<EditText>(R.id.NTarjeta)
        val Nombre = findViewById<EditText>(R.id.Nombre)
        val FechaVencimiento = findViewById<EditText>(R.id.FechaVencimiento)
        val CVV = findViewById<EditText>(R.id.CVV)

        BotonPagar.setOnClickListener{


            val Tarjeta = NTarjeta.text
            val NombreP = Nombre.text
            val Vencimiento = FechaVencimiento.text
            val cvvv = CVV.text

            //muestra mensajito en la consola:v
            Toast.makeText( this, "Numero de la tarjeta: $Tarjeta Nombre: $NombreP Fecha de Vencimiento: $Vencimiento CVV: $cvvv", Toast.LENGTH_LONG).show()

            //para errores o testeo xD
            Log.d("Numero de Tarjeta: ", Tarjeta.toString())
            Log.d("Nombre: ", NombreP.toString())
            Log.d("Fecha de Verncimiento: ", Vencimiento.toString())
            Log.d("CVV: ", cvvv.toString())

        }
    }
}
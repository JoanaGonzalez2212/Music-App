package com.example.ec1_sotelo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = findViewById<EditText>(R.id.editNombre)
        val edad = findViewById<EditText>(R.id.editEdad)
        val telefono = findViewById<EditText>(R.id.editTel)
        val correo = findViewById<EditText>(R.id.editCorreo)
        val password = findViewById<EditText>(R.id.editPass)

        val boton = findViewById<Button>(R.id.btnSaludo)
        val saludo = findViewById<TextView>(R.id.txtSaludo)

        boton.setOnClickListener {


            if (nombre.text.isEmpty() ||
                edad.text.isEmpty() ||
                telefono.text.isEmpty() ||
                correo.text.isEmpty() ||
                password.text.isEmpty()) {

                Toast.makeText(
                    this,
                    "Todos los campos son obligatorios",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }


            if (password.text.length < 6) {

                Toast.makeText(
                    this,
                    "La contraseña debe tener mínimo 6 caracteres",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }


            saludo.text = "Hola ${nombre.text}, tienes ${edad.text} años."

            Toast.makeText(
                this,
                "¡Hola ${nombre.text}!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
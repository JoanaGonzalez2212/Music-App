package com.example.formulario

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

        val nombre = findViewById<EditText>(R.id.etNombre)
        val edad = findViewById<EditText>(R.id.etEdad)
        val telefono = findViewById<EditText>(R.id.etTelefono)
        val correo = findViewById<EditText>(R.id.etCorreo)
        val password = findViewById<EditText>(R.id.etPassword)

        val boton = findViewById<Button>(R.id.btnRegistrar)
        val resultado = findViewById<TextView>(R.id.tvResultado)

        boton.setOnClickListener {

            val nombreTexto = nombre.text.toString()
            val edadTexto = edad.text.toString()
            val telefonoTexto = telefono.text.toString()
            val correoTexto = correo.text.toString()
            val passwordTexto = password.text.toString()

            // Verificar que todos los campos estén llenos
            if (nombreTexto.isEmpty() ||
                edadTexto.isEmpty() ||
                telefonoTexto.isEmpty() ||
                correoTexto.isEmpty() ||
                passwordTexto.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Todos los campos son obligatorios",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (passwordTexto.length < 6) {

                // Validar contraseña
                Toast.makeText(
                    this,
                    "La contraseña debe tener mínimo 6 caracteres",
                    Toast.LENGTH_SHORT
                ).show()

            } else {


                val mensaje = """
                    ¡Hola, $nombreTexto!
                    
                    Edad: $edadTexto
                    Teléfono: $telefonoTexto
                    Correo: $correoTexto
                """.trimIndent()

                resultado.text = mensaje

                // Mostrar saludo en Toast
                Toast.makeText(
                    this,
                    "¡Hola $nombreTexto! Registro exitoso",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
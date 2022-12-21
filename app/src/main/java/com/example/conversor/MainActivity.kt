package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private var resultado: String = ""
    private var ultimoOperador: String = ""
    private var ultimaTecla: String = ""
    private lateinit var ud1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.button)
        var tv1 = findViewById<TextView>(R.id.textView1)
        val list = arrayOf("Millas a KM", "KM a Millas")
        val spinner = findViewById<Spinner>(R.id.spinner_list)
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {


            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,list[position],Toast.LENGTH_SHORT).show()
            }
        }


        button.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Millas a KM" -> tv1.text = "Millas"

            }
        }
        if (spinner.toString() == "Millas a KM") {
           ud1.text = "Milla"

        }

        fun setNumeroPantalla(numero: Int) {
            //Añadimos el numero a la variable resultado
            if (ultimaTecla == "num") {
                resultado += numero.toString()

            } else { //Cuando hacemos AC o C
                resultado = numero.toString()

            }
            //  Mostramos resultado contenido en el TextView
            ud1.text = resultado
            ultimaTecla = "num"
        }
    }

    fun setNumeroPantalla(numero: Int) {
        //Añadimos el numero a la variable resultado
        if (ultimaTecla == "num") {
            resultado += numero.toString()

        } else { //Cuando hacemos AC o C
            resultado = numero.toString()

        }
        //  Mostramos resultado contenido en el TextView
        ud1.text = resultado
        ultimaTecla = "num"
    }
}


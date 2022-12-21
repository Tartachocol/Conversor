package com.example.conversor

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var resultado: String = ""
    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private var c: conversor = conversor()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        tv1 = findViewById<TextView>(R.id.textView1)
        tv2 = findViewById<TextView>(R.id.textView2)
        var et1 = findViewById<TextView>(R.id.editText1)
        var et2 = findViewById<TextView>(R.id.editText2)
        //Array Con opcines
        val listOptions = arrayOf("Millas a KM", "KM a Millas")
        val spinner = findViewById<Spinner>(R.id.spinner_list)

        //Mete las opcines en el espiner
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listOptions)
        spinner.adapter = arrayAdapter


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {


            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            /**
             *   Detecta si has seleccionado lo muestra en el spinner y
             *   ademas detecta la posición que se a seleccionado
             */

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, listOptions[position], Toast.LENGTH_SHORT).show()
                when (position) {

                    1 -> setTexto("KM", "Millas")
                    else -> setTexto("Millas", "KM")
                }





                button.setOnClickListener {
                    when (spinner.selectedItem.toString()) {
                        "Millas a KM" -> setTexto("Millas", "KM")
                        "KM a Millas" -> tv1.text = "KM"
                    }

                }

            }
        }


    }

    fun setTexto(texto1: String, texto2: String): Unit {
        tv1.text = texto1
        tv2.text = texto2


    }


}


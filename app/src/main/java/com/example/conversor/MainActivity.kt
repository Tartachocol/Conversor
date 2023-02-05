package com.example.conversor

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var resultado: String = ""
    private lateinit var et2: TextView
    private lateinit var tv1: TextView
    private lateinit var tv2: TextView

    private var c: conversor = conversor()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)
        tv1 = findViewById<TextView>(R.id.tvUd1)
        tv2 = findViewById<TextView>(R.id.tvUd2)
        var et1 = findViewById<EditText>(R.id.edtNumeroAConvertir)
        et2 = findViewById<TextView>(R.id.tvNumConvertido)

        //Array con las opcines del spinner
        val listOptions = arrayOf(
            "Millas a KM", "KM a Millas", "Litros a Galones", "Galones a Litros", "Kilos a Libras",
            "Libras a Kilos", "Dolares a Euros", "Euros a Dolares", "Metros a Pies", "Pies a Metros"
        )
        val spinner = findViewById<Spinner>(R.id.spinnerList)

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
             *   ademas detecta la posición que se a seleccionado.
             *
             *   Al usar esta funcion hace que la conversion se haga automaticamente al cambiar de unidades
             */

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, listOptions[position], Toast.LENGTH_SHORT).show()

                //La opcion por defecto es la primera opcion
                when (position) {

                    1 -> setTexto("KM", "Millas", 1, et1.text.toString().toDouble())
                    2 -> setTexto("Litros", "Galones", 2, et1.text.toString().toDouble())
                    3 -> setTexto("Galones", "Litros", 3, et1.text.toString().toDouble())
                    4 -> setTexto("Kilos", "Libras", 4, et1.text.toString().toDouble())
                    5 -> setTexto("Libras", "Kilos", 5, et1.text.toString().toDouble())
                    6 -> setTexto("Dolares", "Euros", 6, et1.text.toString().toDouble())
                    7 -> setTexto("Euros", "Dolares", 7, et1.text.toString().toDouble())
                    8 -> setTexto("Metros", "Pies", 8, et1.text.toString().toDouble())
                    9 -> setTexto("Pies", "Metros", 9, et1.text.toString().toDouble())
                    else -> setTexto("Millas", "KM", 0, et1.text.toString().toDouble())
                }

                button.setOnClickListener {
                    when (position) {

                        1 -> setTexto("KM", "Millas", position, et1.text.toString().toDouble())
                        2 -> setTexto("Litros", "Galones", position, et1.text.toString().toDouble())
                        3 -> setTexto("Galones", "Litros", position, et1.text.toString().toDouble())
                        4 -> setTexto("Kilos", "Libras", position, et1.text.toString().toDouble())
                        5 -> setTexto("Libras", "Kilos", position, et1.text.toString().toDouble())
                        6 -> setTexto("Dolares", "Euros", position, et1.text.toString().toDouble())
                        7 -> setTexto("Euros", "Dolares", position, et1.text.toString().toDouble())
                        8 -> setTexto("Metros", "Pies", position, et1.text.toString().toDouble())
                        9 -> setTexto("Pies", "Metros", position, et1.text.toString().toDouble())
                        else -> setTexto("Millas", "KM", position, et1.text.toString().toDouble())
                    }
                }
            }


        }


    }

    //La posicion la usa para saber a que  if entrar y hacer la funcion correspondiente
    fun setTexto(texto1: String, texto2: String, posicion: Int, numero: Double): Unit {
        tv1.text = texto1
        tv2.text = texto2
        if (posicion == 0) {
            et2.text = c.MillasAKilometros(numero).toString()

        } else if (posicion == 1) {
            et2.text = c.KilometrosAMillas(numero).toString()
        } else if (posicion == 2) {
            et2.text = c.litrosAGalones(numero).toString()
        } else if (posicion == 3) {
            et2.text = c.GalonesALitros(numero).toString()
        } else if (posicion == 4) {
            et2.text = c.KilosALibras(numero).toString()
        } else if (posicion == 5) {
            et2.text = c.LibrasAKilos(numero).toString()
        } else if (posicion == 6) {
            et2.text = c.DolaresAEuros(numero).toString()
        } else if (posicion == 7) {
            et2.text = c.EurosADolares(numero).toString()
        } else if (posicion == 8) {
            et2.text = c.MetrosAPieas(numero).toString()
        } else if (posicion == 9) {
            et2.text = c.PiesAMetros(numero).toString()
        }


    }


}


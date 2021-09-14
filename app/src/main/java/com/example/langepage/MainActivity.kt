package com.example.langepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carro : Button = findViewById(R.id.button)
        carro.setOnClickListener { mostrarCarro() }

        val moto : Button = findViewById(R.id.button2)
        moto.setOnClickListener { mostrarMoto() }

        val caminhao : Button = findViewById(R.id.button3)
        caminhao.setOnClickListener { mostrarCaminhao() }
    }

    private fun mostrarMoto(){
        val imagem: ImageView = findViewById(R.id.imageView)
        imagem.setImageResource(R.drawable.moto_1)
    }
    private fun mostrarCarro(){
        val imagem: ImageView = findViewById(R.id.imageView)
        imagem.setImageResource(R.drawable.carro_2)
    }
    private fun mostrarCaminhao(){
        val imagem: ImageView = findViewById(R.id.imageView)
        imagem.setImageResource(R.drawable.caminhao_3)
    }

//    private fun rollDice() {
//        val auto = Automoveis(3)
//        val diceRoll = auto.radar()
//
//        val diceImage: ImageView = findViewById(R.id.imageView)
//
//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.moto_1)
//            2 -> diceImage.setImageResource(R.drawable.carro_2)
//            3 -> diceImage.setImageResource(R.drawable.caminhao_3)
//
//        }
//    }
}


//class Automoveis(private val tipes: Int) {
//
//
//    fun radar(): Int {
//        return (1..tipes).random()
//    }
//}
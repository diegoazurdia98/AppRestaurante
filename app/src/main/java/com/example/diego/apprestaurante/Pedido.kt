package com.example.diego.apprestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Pedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)
    }

    fun Inicio(view: View)
    {
        val menuCall = Intent(this, Inicio::class.java)
        startActivity(menuCall)
    }
}

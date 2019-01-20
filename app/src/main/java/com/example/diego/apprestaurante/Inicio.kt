package com.example.diego.apprestaurante

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent



class Inicio : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    fun miMenu(view: View)
    {
        val menuCall = Intent(this, menu::class.java)
        startActivity(menuCall)
    }

    fun miPedido(view: View)
    {
        val pedidoCall = Intent(this, Pedido::class.java)
        startActivity(pedidoCall)
    }
}

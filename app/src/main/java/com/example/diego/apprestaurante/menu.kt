package com.example.diego.apprestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    /*
    val context = applicationContext
    val resources = context.resources

    val menu = arrayOf("Hamburguesa","Papas Fritas","Pollo","Ensalada","Soda")
    */
/*
    val menu = arrayOf("Hamburguesa", "Pollo", "Costillas","Soda","Refresco")

    val listView = ListView(this)

    val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu)

    val lv = findViewById<ListView>(R.id.list)
    */


    fun Inicio(view: View)
    {
        val menuCall = Intent(this, Inicio::class.java)
        startActivity(menuCall)
    }




}

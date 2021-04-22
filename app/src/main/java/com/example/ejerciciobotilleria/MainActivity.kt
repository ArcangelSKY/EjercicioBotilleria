package com.example.ejerciciobotilleria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleView:RecyclerView
    val Badapter:BotilleriaAdapter = BotilleriaAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun configRecycle(){
        recycleView = findViewById(R.id.recycleView) as RecyclerView
        Badapter.RecyclerAdapter(ingresoDatos(),this)
        recycleView.adapter = Badapter
    }

    fun ingresoDatos():MutableList<Botilleria>{
        var botilleria:MutableList<Botilleria> = ArrayList()
        botilleria.add(Botilleria("Chimbombo","Vino Añiejo","Chileno","Garrafa 5 litros",2000,0))

        return botilleria
    }
}
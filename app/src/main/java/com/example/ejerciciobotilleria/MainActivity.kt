package com.example.ejerciciobotilleria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleView:RecyclerView
    val Badapter:BotilleriaAdapter = BotilleriaAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        configRecycle()

    }
    fun configRecycle(){
        recycleView = findViewById(R.id.recycleView) as RecyclerView
        recycleView.setHasFixedSize(true)
        recycleView.layoutManager = LinearLayoutManager(this)
        Badapter.RecyclerAdapter(ingresoDatos(),this)
        recycleView.adapter = Badapter


    }

    fun ingresoDatos():MutableList<Botilleria>{
        var botilleria:MutableList<Botilleria> = ArrayList()
        botilleria.add(Botilleria("Santa Helena","Vino Añiejo","Chileno","Garrafa 5 litros",4750,R.drawable.b0))
        botilleria.add(Botilleria("Bauzá","Pisco","España","Botella 750 CC",10290,R.drawable.b1))
        botilleria.add(Botilleria("Chivas Regal","Whisky","España","Botella 750 CC",49990,R.drawable.b2))
        botilleria.add(Botilleria("Absolut Blue","Vodka","Suecia","Botella 750 CC",14290,R.drawable.b3))
        botilleria.add(Botilleria("Jim Beam","Vodka","Estados Unidos","Botella 700 CC",15490,R.drawable.b4))
        botilleria.add(Botilleria("Jose Cuervo Blanco 40°","Tequila","México","Botella 700 CC",15490,R.drawable.b5))
        botilleria.add(Botilleria("Barcelo Gran Añejo","Ron","España","Botella 700 CC",10290,R.drawable.b6))
        return botilleria
    }
}
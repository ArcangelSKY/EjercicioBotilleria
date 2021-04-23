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

        recycleView = findViewById(R.id.recycleView)
        configRecycle()
    }
    fun configRecycle(){

        recycleView.setHasFixedSize(true)
        recycleView.layoutManager = LinearLayoutManager(this)
        Badapter.BotilleriaAdapter(ingresoDatos(),this)
        recycleView.adapter = Badapter


    }

}
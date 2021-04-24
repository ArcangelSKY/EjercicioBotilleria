package com.example.ejerciciobotilleria

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import java.io.IOException


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
        Badapter.BotilleriaAdapter(ingresoDatos(), this)
        recycleView.adapter = Badapter


    }

    fun ingresoDatos():List<Botilleria>{
        var json:String = leerJsonBotilleria() // ingresa el metodo en string



            val jsonObjet:JsonObject = Gson().fromJson(json, JsonObject::class.java)

            val gson:Gson = Gson()
            val botilleriaList = object : TypeToken<List<Botilleria?>?>() {}.type // se crea el tipo para parseo datos en tipo jso
                                        // recibe parametro  recibe el tipo
        return  gson.fromJson(jsonObjet.get("botilleria"),botilleriaList) // recibe 2 parametro la data
    }
        // jason en formato string
    private fun leerJsonBotilleria(): String {
        var datoString:String = ""
        try {
            val `is` = applicationContext.assets.open("dataBotilleria.json")
            val size = `is`.available()
            val buffer = ByteArray(size)
            `is`.read(buffer)
            `is`.close()
            datoString = String(buffer)


        }catch (e: IOException){
            e.printStackTrace()
        }
        return datoString

    }
}
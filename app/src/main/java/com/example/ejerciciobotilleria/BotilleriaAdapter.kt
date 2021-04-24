package com.example.ejerciciobotilleria


import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class BotilleriaAdapter() : RecyclerView.Adapter<BotilleriaAdapter.ViewHolder>() {
    var botilleria: List<Botilleria> = ArrayList()
    lateinit var context: Context

    fun BotilleriaAdapter(botilleria: List<Botilleria>, context: Context) {
        this.botilleria = botilleria
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = botilleria.get(position)
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_botella, parent, false))
    }

    override fun getItemCount(): Int {
        return botilleria.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nombreLicor = view.findViewById(R.id.tv_Nombre) as TextView
        val imagen = view.findViewById(R.id.iv_imagen) as ImageView


        fun bind(botilleria: Botilleria, context: Context) {
            nombreLicor.text = botilleria.Nombre

/**
            itemView.setOnClickListener(View.OnClickListener {
                Toast.makeText(
                    context,
                "ha presionado el dato ${botilleria.Nombre}",
                Toast.LENGTH_LONG
                ).show()
            })
*/


        }

     /**   fun ImageView.from(link:String){

        }*/

    }
}
/**
Picasso.get().load(Resource).into(imgView)

19:24

Picasso.get().load( context.getString(R.string.images_folder)+licoresList.get(position).getFoto()).into(holder.ivFoto);
*/
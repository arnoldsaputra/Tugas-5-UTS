package com.mobile.Kantin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KantinAdapter(private val context: Context, private val kantin: List<Kantin>, val listener: (Kantin) -> Unit)
    : RecyclerView.Adapter<KantinAdapter.KantinViewHolder>(){
    class KantinViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imageKantin = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameKantin = view.findViewById<TextView>(R.id.tv_item_name)
        val descKantin = view.findViewById<TextView>(R.id.tv_item_description)


        fun binView(kantin: Kantin, listener: (Kantin) -> Unit){
            imageKantin.setImageResource(kantin.imageKantin)
            nameKantin.text = kantin.nameKantin
            descKantin.text = kantin.descKantin
            itemView.setOnClickListener{
                listener(kantin)
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KantinViewHolder {
        return KantinViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_kantin, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KantinViewHolder, position: Int) {
        holder.binView(kantin[position], listener)
    }

    override fun getItemCount(): Int = kantin.size
}

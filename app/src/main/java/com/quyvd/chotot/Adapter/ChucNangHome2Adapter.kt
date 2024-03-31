package com.quyvd.chotot.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quyvd.chotot.ChucNangHome
import com.quyvd.chotot.ChucNangHome2
import com.quyvd.chotot.R

class ChucNangHome2Adapter(private var listChucNangHome2: List<ChucNangHome2>) : RecyclerView.Adapter<ChucNangHome2Adapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameCn2 = view.findViewById<TextView>(R.id.tvNameCn2)
        val iconCn2 = view.findViewById<AppCompatImageView>(R.id.icCn2)
        fun bind(item: ChucNangHome2) {
            nameCn2.text = item.nameCn2
            Glide.with(itemView.context).load(item.iconCn2).into(iconCn2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_chucnang2, parent, false))
    }

    override fun getItemCount(): Int {
        return listChucNangHome2.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listChucNangHome2[position])
    }
}
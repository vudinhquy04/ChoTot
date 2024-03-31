package com.quyvd.chotot.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quyvd.chotot.ChucNangHome
import com.quyvd.chotot.R

class ChucNangHomeAdapter(private var listChucNangHome: List<ChucNangHome>) : RecyclerView.Adapter<ChucNangHomeAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameCn = view.findViewById<TextView>(R.id.tvNameCn)
        val iconCn1 = view.findViewById<AppCompatImageView>(R.id.icCn)
        fun bind(item: ChucNangHome) {
            nameCn.text = item.nameCn
            Glide.with(itemView.context).load(item.iconCn).into(iconCn1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_chucnang1, parent, false))
    }

    override fun getItemCount(): Int {
        return listChucNangHome.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listChucNangHome[position])
    }
}
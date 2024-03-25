package com.quyvd.chotot.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quyvd.chotot.R

class SlideHomeAdapter(var listItem: List<String>) : RecyclerView.Adapter<SlideHomeAdapter.SlideViewHolder>() {

    inner class SlideViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgSlide: AppCompatImageView = view.findViewById(R.id.imgSlide)
        fun bind(item: String) {
            Glide.with(itemView.context).load(item).into(imgSlide)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_slide, parent, false)
        return SlideViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int) {
        holder.bind(listItem[position])
    }
}
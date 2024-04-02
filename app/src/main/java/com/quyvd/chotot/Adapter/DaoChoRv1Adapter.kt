package com.quyvd.chotot.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quyvd.chotot.DaoCho
import com.quyvd.chotot.R

class DaoChoRv1Adapter(private var listSanPham: List<DaoCho>) : RecyclerView.Adapter<DaoChoRv1Adapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgUser = view.findViewById<AppCompatImageView>(R.id.imgUser)
        val nameUser = view.findViewById<TextView>(R.id.tvNameUser)
        val thoiGian = view.findViewById<TextView>(R.id.tvThoiGian)
        val imgAnhsp1 = view.findViewById<AppCompatImageView>(R.id.imgSp2)
        val giaBan = view.findViewById<TextView>(R.id.tvGiaBan2)
        val thongTin = view.findViewById<TextView>(R.id.tvTtsp2)
        fun bind(item: DaoCho) {
            nameUser.text = item.nameUser
            thoiGian.text = item.thoiGian
            giaBan.text= item.giaBan
            thongTin.text = item.thongTin
            Glide.with(itemView.context).load(item.imgUser).into(imgUser)
            Glide.with(itemView.context).load(item.anhSp2).into(imgAnhsp1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_chucnang4, parent, false))
    }

    override fun getItemCount(): Int {
        return listSanPham.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listSanPham[position])
    }
}
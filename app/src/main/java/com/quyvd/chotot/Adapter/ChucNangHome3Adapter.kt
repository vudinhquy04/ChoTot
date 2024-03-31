package com.quyvd.chotot.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.quyvd.chotot.ChucNangHome
import com.quyvd.chotot.ChucNangHome2
import com.quyvd.chotot.ChucNangHome3
import com.quyvd.chotot.R

class ChucNangHome3Adapter(private var listChucNangHome3: List<ChucNangHome3>) : RecyclerView.Adapter<ChucNangHome3Adapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgSp = view.findViewById<AppCompatImageView>(R.id.imgSp1)
        val ttSp = view.findViewById<TextView>(R.id.tvTtsp)
        val giaSp = view.findViewById<TextView>(R.id.tvGiaBan1)
        val banNgay = view.findViewById<TextView>(R.id.tvDate1)
        fun bind(item: ChucNangHome3) {
            ttSp.text = item.ttCn
            giaSp.text = item.giaBan
            banNgay.text = item.ngayBan
            Glide.with(itemView.context).load(item.imgSanPham).into(imgSp)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_chucnang3, parent, false))
    }

    override fun getItemCount(): Int {
        return listChucNangHome3.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listChucNangHome3[position])
    }
}
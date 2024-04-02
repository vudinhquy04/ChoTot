package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quyvd.chotot.Adapter.DaoChoRvAdapter

class NearyouFragment : Fragment() {
    private lateinit var daoChoRvAdapter: DaoChoRvAdapter
    private lateinit var rvCn5 : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearyou, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCn5 = view.findViewById(R.id.rvCn5)
        val listSanPham: ArrayList<DaoCho> = ArrayList()
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://thuthuatnhanh.com/wp-content/uploads/2019/10/anh-girl-xinh-ha-noi-2k.jpg","Vu Dinh Quy", "Hom Qua","https://hc.com.vn/i/ecommerce/media/ckeditor_3370949.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        daoChoRvAdapter= DaoChoRvAdapter(listSanPham)

        rvCn5.adapter = daoChoRvAdapter

        rvCn5.layoutManager = GridLayoutManager(context, 1)

    }
}
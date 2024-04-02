package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quyvd.chotot.Adapter.DaoChoRvAdapter

class ForyouFragment : Fragment() {
    private lateinit var daoChoRv1Adapter: DaoChoRvAdapter
    private lateinit var rvCn6 : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foryou, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCn6 = view.findViewById(R.id.rvCn6)
        val listSanPham: ArrayList<DaoCho> = ArrayList()
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://i.imgur.com/5HAX9Zx.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/756/dien-thoai-iphone-13-pro-128gb-bac-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        daoChoRv1Adapter= DaoChoRvAdapter(listSanPham)

        rvCn6.adapter = daoChoRv1Adapter

        rvCn6.layoutManager = GridLayoutManager(context, 1)

    }

}
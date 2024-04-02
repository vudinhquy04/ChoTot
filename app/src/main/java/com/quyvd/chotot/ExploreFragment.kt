package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.quyvd.chotot.Adapter.DaoChoRvAdapter

class ExploreFragment : Fragment() {
    private lateinit var daoChoRv2Adapter: DaoChoRvAdapter
    private lateinit var rvCn7 : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCn7 = view.findViewById(R.id.rvCn7)
        val listSanPham: ArrayList<DaoCho> = ArrayList()
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        listSanPham.add(DaoCho("https://kynguyenlamdep.com/wp-content/uploads/2022/06/anh-gai-xinh-tu-suong-voi-dien-thoai.jpg","Vu Dinh Quy", "Hom Qua","https://cdn.nguyenkimmall.com/images/detailed/668/10046526-dien-thoai-iphone-11-pro-max-256gb-xanh-la-1.jpg","100.000.000 đ","Điện thoại Samsung Galaxy A20s 3GB/32GB Đỏ giá rẻ, chính hãng, trả góp 0% - Siêu thị điện máy HC"))
        daoChoRv2Adapter= DaoChoRvAdapter(listSanPham)

        rvCn7.adapter = daoChoRv2Adapter

        rvCn7.layoutManager = GridLayoutManager(context, 1)

    }

}
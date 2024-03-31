package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.quyvd.chotot.Adapter.QuanLyPagerAdapter

class QuanLyFragment : Fragment() {
    private lateinit var quanLyPagerAdapter: QuanLyPagerAdapter
    private lateinit var tlQuanLy: TabLayout
    private lateinit var vpQuanLy: ViewPager2
    private lateinit var canThanhToanFragment: CanThanhToanFragment
    private lateinit var dangHienThiFragment: DangHienThiFragment
    private lateinit var hetHanFragment: HetHanFragment
    private lateinit var tuChoiFragment: TuChoiFragment
    private lateinit var tinNhapFragment: TinNhapFragment
    private lateinit var choDuyetFragment: ChoDuyetFragment
    private lateinit var daAnFragment: DaAnFragment


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quan_ly, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vpQuanLy = view.findViewById(R.id.vpQuanLy)
        tlQuanLy = view.findViewById(R.id.tlQuanLy)

        dangHienThiFragment = DangHienThiFragment()
        hetHanFragment = HetHanFragment()
        tuChoiFragment = TuChoiFragment()
        canThanhToanFragment = CanThanhToanFragment()
        tinNhapFragment = TinNhapFragment()
        choDuyetFragment = ChoDuyetFragment()
        daAnFragment = DaAnFragment()


        val listQuanLyFragment: ArrayList<Fragment> = ArrayList()
        listQuanLyFragment.add(dangHienThiFragment)
        listQuanLyFragment.add(hetHanFragment)
        listQuanLyFragment.add(tuChoiFragment)
        listQuanLyFragment.add(canThanhToanFragment)
        listQuanLyFragment.add(tinNhapFragment)
        listQuanLyFragment.add(choDuyetFragment)
        listQuanLyFragment.add(daAnFragment)

        quanLyPagerAdapter = QuanLyPagerAdapter(requireActivity(), listQuanLyFragment)
        vpQuanLy.adapter = quanLyPagerAdapter

        TabLayoutMediator(tlQuanLy, vpQuanLy) { tab, index ->
            run {
                if (index == 0) {
                    tab.text = "Đang Hiển Thị (0)"
                } else if (index == 1) {
                    tab.text = "Hết Hạn (0)"
                } else if (index == 2) {
                    tab.text = "Bị Từ Chối (0)"
                } else if (index == 3) {
                    tab.text = "Cần Thanh Toán (0)"
                } else if (index == 4) {
                    tab.text = "Tin Nháp (0)"
                } else if (index == 5) {
                    tab.text = "Chờ Duyệt (0)"
                } else {
                    tab.text = "Đã Ẩn (0)"
                }
            }
        }.attach()
    }
}
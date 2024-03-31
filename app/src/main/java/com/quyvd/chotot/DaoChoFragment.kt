package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.quyvd.chotot.Adapter.ChucNangHome3Adapter
import com.quyvd.chotot.Adapter.DaoChoPagerAdapter
import com.quyvd.chotot.Adapter.DaoChoRvAdapter

class DaoChoFragment : Fragment() {
    private lateinit var vpDaoCho: ViewPager2
    private lateinit var tlDaoCho: TabLayout
    private lateinit var exploreFragment: Fragment
    private lateinit var forYouFragment: Fragment
    private lateinit var nearYouFragment: Fragment
    private lateinit var daoChoPagerAdapter: DaoChoPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dao_cho, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        ////////////////////////////////////////////////////
        vpDaoCho = view.findViewById(R.id.vpDaocho)

        tlDaoCho = view.findViewById(R.id.tlDaoCho)



        exploreFragment = ExploreFragment()
        nearYouFragment = NearyouFragment()
        forYouFragment = ForyouFragment()



        val listDaoChoFragment: ArrayList<Fragment> = ArrayList()
        listDaoChoFragment.add(nearYouFragment)
        listDaoChoFragment.add(forYouFragment)
        listDaoChoFragment.add(exploreFragment)



        daoChoPagerAdapter = DaoChoPagerAdapter(requireActivity(), listDaoChoFragment)

        vpDaoCho.adapter = daoChoPagerAdapter

        TabLayoutMediator(tlDaoCho, vpDaoCho) { tab, index ->
            run {
                if (index==0){
                    tab.text = "Gần Bạn"
                }else if (index==1){
                    tab.text = "Dành Cho Bạn"
                }else{
                    tab.text = "Khám Phá"
                }
            }
        }.attach()




        ///////////////////////////////////////////////////////////////////


    }


}



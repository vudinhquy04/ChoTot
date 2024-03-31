package com.quyvd.chotot.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.ListFragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DaoChoPagerAdapter(val fragment: FragmentActivity, private val listFragment: ArrayList<Fragment>) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return listFragment.size
    }

    override fun createFragment(position: Int): Fragment {
        return listFragment[position]
    }
}
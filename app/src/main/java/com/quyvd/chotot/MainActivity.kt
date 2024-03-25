package com.quyvd.chotot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private lateinit var homeFragment: HomeFragment
    private lateinit var quanLyFragment: QuanLyFragment
    private lateinit var dangTinFragment: DangTinFragment
    private lateinit var daoChoFragment: DaoChoFragment
    private lateinit var taiKhoanFragment: TaiKhoanFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeFragment = HomeFragment()
        quanLyFragment = QuanLyFragment()
        dangTinFragment = DangTinFragment()
        daoChoFragment = DaoChoFragment()
        taiKhoanFragment = TaiKhoanFragment()

        thayDoiManHinh(homeFragment)
    }
    private fun thayDoiManHinh(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flFragment, fragment)
        transaction.commitNowAllowingStateLoss()
    }

}
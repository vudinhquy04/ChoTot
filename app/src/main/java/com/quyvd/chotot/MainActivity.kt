package com.quyvd.chotot

import android.content.ClipData.Item
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var btnBottom: BottomNavigationView
    private lateinit var homeFragment: HomeFragment
    private lateinit var ctlMain : ConstraintLayout
    private lateinit var quanLyFragment: QuanLyFragment
    private lateinit var dangTinFragment: DangTinFragment
    private lateinit var daoChoFragment: DaoChoFragment
    private lateinit var taiKhoanFragment: TaiKhoanFragment
    private lateinit var edtSearch : LinearLayoutCompat
    private lateinit var txtManerger : AppCompatTextView
    private lateinit var imgIcsearch : AppCompatImageView
    private lateinit var icSearch : AppCompatImageView
    private lateinit var imgNotifi1 : AppCompatImageView
    private lateinit var icChat : AppCompatImageView

    private var currentItem = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeFragment = HomeFragment()
        quanLyFragment = QuanLyFragment()
        dangTinFragment = DangTinFragment()
        daoChoFragment = DaoChoFragment()
        taiKhoanFragment = TaiKhoanFragment()
        ctlMain = findViewById(R.id.ctlMain)
        edtSearch = findViewById(R.id.edt_search)
        btnBottom = findViewById(R.id.bnvContent)
        txtManerger = findViewById(R.id.txtManerger)
        imgIcsearch = findViewById(R.id.ic_search2)
        icSearch = findViewById(R.id.ic_search3)
        imgNotifi1 = findViewById(R.id.ic_notifi)
        icChat = findViewById(R.id.ic_Chat)


        thayDoiManHinh(homeFragment)

        btnBottom.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    currentItem = R.id.menu_home
                    thayDoiManHinh(homeFragment)
                    edtSearch.visibility = View.VISIBLE
                    icSearch.visibility = View.GONE
                    icChat.visibility = View.VISIBLE

                }
                R.id.menu_manager -> {
                    currentItem = R.id.menu_manager
                    thayDoiManHinh(quanLyFragment)
                    edtSearch.visibility = View.GONE
                    txtManerger.visibility = View.VISIBLE
                    imgIcsearch.visibility = View.GONE
                    txtManerger.setText("Quản Lý Tin Đăng")
                    icSearch.visibility = View.VISIBLE
                    icChat.visibility = View.VISIBLE
                }
                R.id.menu_dangTin -> {
                    val intent = Intent(this,PostNewsActivity::class.java)
                    startActivity(intent)
                }
                R.id.menu_cho -> {
                    currentItem = R.id.menu_cho
                    thayDoiManHinh(daoChoFragment)
                    edtSearch.visibility = View.GONE
                    imgIcsearch.visibility = View.GONE
                    txtManerger.setText("Dạo Chợ")
                    icChat.visibility = View.VISIBLE

                }
                R.id.menu_user -> {
                    currentItem = R.id.menu_user
                    thayDoiManHinh(taiKhoanFragment)
                    imgIcsearch.visibility = View.GONE
                    txtManerger.setText("Thêm")
                    edtSearch.visibility = View.GONE
                    icSearch.visibility = View.GONE
                    icChat.visibility = View.GONE


                }
            }
            true
        }
    }
    private fun thayDoiManHinh(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flFragment, fragment)
        transaction.commitNowAllowingStateLoss()
    }

    override fun onRestart() {

        super.onRestart()
        btnBottom.selectedItemId = currentItem
    }

}
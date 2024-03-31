package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.quyvd.chotot.Adapter.ChucNangHome2Adapter
import com.quyvd.chotot.Adapter.ChucNangHome3Adapter
import com.quyvd.chotot.Adapter.ChucNangHomeAdapter
import com.quyvd.chotot.Adapter.SlideHomeAdapter


class HomeFragment : Fragment() {
        private lateinit var vpHome : ViewPager2
        private lateinit var slideHomeAdapter : SlideHomeAdapter
        private lateinit var chucNangHomeAdapter: ChucNangHomeAdapter
        private lateinit var chucNangHomeAdapter2: ChucNangHome2Adapter
        private lateinit var chucNangHomeAdapter3: ChucNangHome3Adapter
        private lateinit var rvCn: RecyclerView
        private lateinit var rvCn2: RecyclerView
        private lateinit var rvCn3 : RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        vpHome = view.findViewById(R.id.vpHome)
        val listImage = ArrayList<String>()
        listImage.add("https://png.pngtree.com/thumb_back/fw800/background/20230518/pngtree-dog-sits-near-an-orange-cat-in-a-field-image_2577166.jpg")
        listImage.add("https://png.pngtree.com/thumb_back/fw800/background/20230521/pngtree-cute-kitten-and-tiny-puppy-on-grass-wallpaper-image_2701573.jpg")
        listImage.add("https://file.hstatic.net/200000159621/article/cho_meo_b9a344a37bc84a70ab8c4f2927b5484e_grande.jpg")
        listImage.add("https://vuanem.com/blog/wp-content/uploads/2023/02/dat-ten-cho-cho-meo-hay-1125x750.jpg")
        listImage.add("https://vtv1.mediacdn.vn/zoom/640_400/562122370168008704/2023/10/4/photo1696416835262-169641683538190885134.jpg")
        slideHomeAdapter = SlideHomeAdapter(listImage)

        vpHome.adapter = slideHomeAdapter



        ///////////////////////////////////////////
        rvCn = view.findViewById(R.id.rvCn)
        val listChucNang: ArrayList<ChucNangHome> = ArrayList()
        listChucNang.add(ChucNangHome("Thanh Lý Size Lầm","https://img.thuthuatphanmem.vn/uploads/2018/10/26/anh-dep-cau-rong-da-nang-viet-nam_055418962.jpg"))
        listChucNang.add(ChucNangHome("Thu Mua Điện Thoại","https://static2.yan.vn/YanNews/2167221/202104/1-aafae6b1.jpg"))
        listChucNang.add(ChucNangHome("Nạp Đồng Tốt","https://recmiennam.com/wp-content/uploads/2018/03/hinh-anh-bien-dep-36.jpg"))
        listChucNang.add(ChucNangHome("Thu Mua Ô Tô","https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-bien-dep-va-con-thuyen-tho-mong.jpg"))
        listChucNang.add(ChucNangHome("Chợ Tốt Ưu Đãi","https://toanthaydinh.com/wp-content/uploads/2020/04/hinh-nen-full-hd-1080-bai-bien-xanh-ngat_022854175-1.jpg"))
        listChucNang.add(ChucNangHome("Gói Pro","https://img.thuthuatphanmem.vn/uploads/2018/10/08/anh-anime-phong-canh-dep_093817122.jpg"))
        listChucNang.add(ChucNangHome("Tin Đăng Đã Lưu","https://scr.vn/wp-content/uploads/2020/08/C%E1%BA%A3nh-ho%C3%A0ng-h%C3%B4n-4k-%C4%91%E1%BA%B9p-scaled.jpg"))
        listChucNang.add(ChucNangHome("Đăng Tin Cho Tặng","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        chucNangHomeAdapter= ChucNangHomeAdapter(listChucNang)

        rvCn.adapter = chucNangHomeAdapter

        rvCn.layoutManager = GridLayoutManager(context, 1, LinearLayoutManager.HORIZONTAL, false)



        //////////////////////////////////////////////////////////////////////////
        rvCn2 = view.findViewById(R.id.rvCn2)
        val listChucNang2: ArrayList<ChucNangHome2> = ArrayList()
        listChucNang2.add(ChucNangHome2("Bất Động Sản","https://img.thuthuatphanmem.vn/uploads/2018/10/26/anh-dep-cau-rong-da-nang-viet-nam_055418962.jpg"))
        listChucNang2.add(ChucNangHome2("Xe Cộ","https://static2.yan.vn/YanNews/2167221/202104/1-aafae6b1.jpg"))
        listChucNang2.add(ChucNangHome2("Đồng Hồ Điện Tử","https://recmiennam.com/wp-content/uploads/2018/03/hinh-anh-bien-dep-36.jpg"))
        listChucNang2.add(ChucNangHome2("Đồ Gia Dụng, Nội Thất, Cây Cảnh","https://haycafe.vn/wp-content/uploads/2021/12/hinh-anh-bien-dep-va-con-thuyen-tho-mong.jpg"))
        listChucNang2.add(ChucNangHome2("Giải Trí Thể Thao, Sở Thích","https://toanthaydinh.com/wp-content/uploads/2020/04/hinh-nen-full-hd-1080-bai-bien-xanh-ngat_022854175-1.jpg"))
        listChucNang2.add(ChucNangHome2("Mẹ và Bé","https://img.thuthuatphanmem.vn/uploads/2018/10/08/anh-anime-phong-canh-dep_093817122.jpg"))
        listChucNang2.add(ChucNangHome2("Dịch Vụ, Du Lịch","https://scr.vn/wp-content/uploads/2020/08/C%E1%BA%A3nh-ho%C3%A0ng-h%C3%B4n-4k-%C4%91%E1%BA%B9p-scaled.jpg"))
        listChucNang2.add(ChucNangHome2("Việc Làm","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Thú Cưng","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Đồ Ăn, Thực Phẩm và các loại khác","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Tủ Lạnh, Máy lạnh, Máy giặt","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Thời Trang, Đồ dùng cá nhân","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Đồ Dùng Văn Phòng","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        listChucNang2.add(ChucNangHome2("Cho Tặng Miễn Phí","https://3.bp.blogspot.com/-6DgKmEjT3io/WVpJk3yR34I/AAAAAAAAoZ8/dMR258cSu4UcLjxKafS9wqGMMgz1ZiOfACLcBGAs/s1600/58e427bdc98b5.jpg"))
        chucNangHomeAdapter2= ChucNangHome2Adapter(listChucNang2)

        rvCn2.adapter = chucNangHomeAdapter2

        rvCn2.layoutManager = GridLayoutManager(context, 2, LinearLayoutManager.HORIZONTAL, false)




        ///////////////////////////////////////////////////////////////////////////////////

        rvCn3 = view.findViewById(R.id.rvCn3)
        val listChucNang3: ArrayList<ChucNangHome3> = ArrayList()
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))
        listChucNang3.add(ChucNangHome3("https://cdn.nguyenkimmall.com/images/product/829/dien-thoai-iphone-14-pro-max-1tb-tim-1.jpg","Điện thoại iPhone 14 Pro Max 1TB Tím Giá Tốt, Chính Hãng | Nguyễn Kim","3300000 đ","Hôm qua · Đà Nẵng"))

        chucNangHomeAdapter3= ChucNangHome3Adapter(listChucNang3)

        rvCn3.adapter = chucNangHomeAdapter3

        rvCn3.layoutManager = GridLayoutManager(context, 2)

        /////////////////////////////////////////////////////////////////////////////



    }

}
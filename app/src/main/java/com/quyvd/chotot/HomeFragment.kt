package com.quyvd.chotot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.quyvd.chotot.Adapter.SlideHomeAdapter


class HomeFragment : Fragment() {
        private lateinit var vpHome : ViewPager2
        private lateinit var slideHomeAdapter : SlideHomeAdapter

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

    }

}
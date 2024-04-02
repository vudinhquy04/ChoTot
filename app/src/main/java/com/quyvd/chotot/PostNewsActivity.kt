package com.quyvd.chotot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class PostNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_news)
        val back = findViewById<AppCompatTextView>(R.id.btn_back)
        back.setOnClickListener {
            finish()
        }
    }
}
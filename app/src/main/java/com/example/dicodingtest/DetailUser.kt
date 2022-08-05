package com.example.dicodingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


class DetailUser:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_per_user)

        val nameUser:TextView = findViewById(R.id.User_name)
        val photoUser:ImageView = findViewById(R.id.imageView)
        val detailUser:TextView = findViewById(R.id.Detail_User)

        nameUser.text = intent.getStringExtra("NAMA")
        detailUser.text = intent.getStringExtra("DETAIL")
        Glide.with(this)
            .load(intent.getIntExtra("PHOTO",0))
            .into(photoUser)


    }
}

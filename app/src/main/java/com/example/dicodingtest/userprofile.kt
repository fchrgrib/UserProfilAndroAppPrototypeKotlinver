package com.example.dicodingtest

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class userprofile:AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profileuser)

        val name:TextView = findViewById(R.id.name_profile_user)
        val email:TextView = findViewById(R.id.email_profile_user)
        val detail:TextView = findViewById(R.id.detail_profile_user)
        val photo:ImageView = findViewById(R.id.imageprofile)

        val date:TextView = findViewById(R.id.date_profile_user)

        name.text = "Fahrian Afdholi"
        email.text = "Fahrian.alifudin@gmail.com"
        detail.text = "Saya adalah seseorang yang sangat senang srkali membuat sebuah program dan saya ingin mengasah hal tersebut di dicoding dan saya harap saya bisa menjadi seorang profesional"
        date.text = "23 Oktober 2001"
        Glide.with(this)
            .load(R.mipmap.avatar_1)
            .into(photo)
    }
}
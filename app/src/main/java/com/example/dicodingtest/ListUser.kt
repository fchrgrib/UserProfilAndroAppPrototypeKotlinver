package com.example.dicodingtest

object ListUser {
    private val userName = arrayOf(
        "Sutanto",
        "Abdul Hakim",
        "Subroto",
        "Malik Al Majid",
        "Muhammad Arif Mukhsinin",
        "Michael Halim",
        "Christiian Wijaya",
        "Gabriela Panjaitan",
        "Muhammad Fahrezy",
        "Jonathan"
    )
    private val detailUser = arrayOf(
        "Saya adalah seseoorang yang ingin belajar tentang pemrograman dan saya harap dicoding bisa mengasah skill yang sedang saya asah sekarang ini",
        "Berasal dari anak daerah yang mempelajari pemrograman secara online melalui Dicoding",
        "Berusia 40 tahun tidak menghentikan saya untuk mempelajari pemrograman",
        "Memiliki hobi mengotak atik komputer dan akhirnya terjun di software engineer dan mengasah lagi skill yang ada dengan belajar di DIcoding",
        "Saya ingin membuat sebuah aplikasi yang berguna bagi masyarakat dan memulainya dengan belajar di Dicoding",
        "Ingin terus belajar untuk terus mengasah skill yang ada",
        "Orang awam yang ingin menguasai bahasa pemrograman",
        "Semakin dibutuhkannya orang orang yang memiliki skill programming membuat saya tertarik untuk mempelajrinya",
        "Berharap menjadi ahli dalam pemrograman",
        "Seseorang yang ingin menjadi software engineer"
    )
    private val photoUser = intArrayOf(
        R.mipmap.avatar_1,
        R.mipmap.avatar_2_foreground,
        R.mipmap.avatar_3_foreground,
        R.mipmap.avatar_4_foreground,
        R.mipmap.avatar_5_foreground,
        R.mipmap.avatar_6_foreground,
        R.mipmap.avatar_7_foreground,
        R.mipmap.avatar_8_foreground,
        R.mipmap.avatar_9_foreground,
        R.mipmap.avatar_10_foreground
    )

    val listData:ArrayList<DataUser>
        get() {
            val list = arrayListOf<DataUser>()
            for(position in userName.indices){
                val data = DataUser()
                data.name = userName[position]
                data.detail = detailUser[position]
                data.photo = photoUser[position]
                list.add(data)
            }
            return list
        }
}
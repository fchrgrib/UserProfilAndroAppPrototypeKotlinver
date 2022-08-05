package com.example.dicodingtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvUser: RecyclerView
    private var list: ArrayList<DataUser> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUser = findViewById(R.id.rv_heroes)
        rvUser.setHasFixedSize(true)

        list.addAll(ListUser.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvUser.layoutManager = LinearLayoutManager(this)
        val cardViewAdap = CardView(list)
        rvUser.adapter = cardViewAdap
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.firstmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(select:Int){
        if(select.equals(R.id.action_about)){
            startActivity(Intent(this,userprofile::class.java))
        }
    }
}
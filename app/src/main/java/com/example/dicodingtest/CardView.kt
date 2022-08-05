package com.example.dicodingtest


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.content.Intent


class CardView(private val listUser: ArrayList<DataUser>) : RecyclerView.Adapter<CardView.CardViewView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewView {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return CardViewView(view)
    }

    override fun onBindViewHolder(holder: CardViewView, position: Int) {
        val userList = listUser[position]
        val context:Context  = holder.itemView.context
        Glide.with(context)
            .load(userList.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = userList.name
        holder.tvDetail.text = userList.detail
        holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listUser[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        holder.itemView.setOnClickListener(View.OnClickListener {
            context.startActivity(Intent(context,DetailUser::class.java)
                .putExtra("NAME",listUser[holder.adapterPosition].name)
                .putExtra("DETAIL",listUser[holder.adapterPosition].detail)
                .putExtra("PHOTO",listUser[holder.adapterPosition].photo)
            )
        })
    }


    override fun getItemCount(): Int {
        return listUser.size
    }

    inner class CardViewView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.name_user)
        var tvDetail: TextView = itemView.findViewById(R.id.detail_user)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
    }




}


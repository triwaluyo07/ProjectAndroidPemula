package com.triwaluyo07.projectandroidpemula

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val mContext: Context,private val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_food,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.ImgPhoto)

        holder.tvName.text = listFood[position].name
        holder.tvSubtitle.text = listFood[position].subtitle


        holder.itemView.setOnClickListener{

            val detail = Intent(mContext,DetailActivity::class.java)
            detail.putExtra("NAMA",listFood[position].name)
            detail.putExtra("SUBTITLE",listFood[position].subtitle)
            detail.putExtra("DETAIL",listFood[position].detail)
            detail.putExtra("IMAGE",listFood[position].photo)
            mContext.startActivity(detail)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvSubtitle: TextView = itemView.findViewById(R.id.tv_item_subtitle)
        var ImgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}
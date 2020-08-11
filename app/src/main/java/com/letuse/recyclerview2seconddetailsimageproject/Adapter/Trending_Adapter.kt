package com.letuse.recyclerview2seconddetailsimageproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2seconddetailsimageproject.Model.Trending_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.discover_item.view.*
import kotlinx.android.synthetic.main.trending_item.view.*

class Trending_Adapter (var SitemList : ArrayList<Trending_Item>) : RecyclerView.Adapter<Trending_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(trendingItem: Trending_Item){
            itemView.Trending_Image.setImageResource(trendingItem.Image)
            itemView.Trending_Name.text = trendingItem.Name
            itemView.Trending_Price.text = trendingItem.Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.trending_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return SitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(SitemList[position])
    }
}
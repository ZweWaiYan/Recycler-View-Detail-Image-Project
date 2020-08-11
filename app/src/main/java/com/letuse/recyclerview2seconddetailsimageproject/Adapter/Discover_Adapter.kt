package com.letuse.recyclerview2seconddetailsimageproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2seconddetailsimageproject.Model.Discover_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.discover_item.view.*

class Discover_Adapter(var FitemList : ArrayList<Discover_Item>) : RecyclerView.Adapter<Discover_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(discoverItem: Discover_Item){
            itemView.Image.setImageResource(discoverItem.Image)
            itemView.Discover_Name.text = discoverItem.Name
            itemView.Discover_Items.text = discoverItem.Item_Amount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.discover_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return FitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(FitemList[position])
    }
}
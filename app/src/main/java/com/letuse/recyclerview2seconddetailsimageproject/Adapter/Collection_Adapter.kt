package com.letuse.recyclerview2seconddetailsimageproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2seconddetailsimageproject.Model.Collection_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.collection_item.view.*

class Collection_Adapter(var TitemList : ArrayList<Collection_Item>) : RecyclerView.Adapter<Collection_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(collectionItem: Collection_Item){
            itemView.Collection_Text.text = collectionItem.Name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.collection_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return TitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(TitemList[position])
    }
}
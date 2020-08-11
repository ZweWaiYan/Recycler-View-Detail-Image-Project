package com.letuse.recyclerview2seconddetailsimageproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.letuse.recyclerview2seconddetailsimageproject.Model.Best_Selling_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.best_selling_item.view.*

class Best_Selling_Adapter(var FoitemList : ArrayList<Best_Selling_Item>) : RecyclerView.Adapter<Best_Selling_Adapter.ItemViewHolder>(){
    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bind(bestSellingItem: Best_Selling_Item){
            itemView.Best_Selling_Image.setImageResource(bestSellingItem.Image)
            itemView.Best_Selling_Name.text = bestSellingItem.Name
            itemView.Best_Selling_Price.text = bestSellingItem.Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.best_selling_item , parent , false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return FoitemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(FoitemList[position])
    }


}
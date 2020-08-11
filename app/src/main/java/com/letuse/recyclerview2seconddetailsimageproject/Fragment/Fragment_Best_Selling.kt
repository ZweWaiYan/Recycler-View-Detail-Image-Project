package com.letuse.recyclerview2seconddetailsimageproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Best_Selling_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Discover_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Trending_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Model.Best_Selling_Item
import com.letuse.recyclerview2seconddetailsimageproject.Model.Discover_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.fragment__discover.*

class Fragment_Best_Selling : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__best__selling, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var FoList = ArrayList<Best_Selling_Item>()

        FoList.add(Best_Selling_Item(R.drawable.best_selling_one, "Ruffle Trim Spot Wrap Dress" , "$29.00"))
        FoList.add(Best_Selling_Item(R.drawable.best_selling_two, "Leaf Floral Print Random" , "$29.00"))
        FoList.add(Best_Selling_Item(R.drawable.best_selling_three, "Drop Shoulder Geo Pattern" , "$29.00"))
        FoList.add(Best_Selling_Item(R.drawable.best_selling_one, "Ruffle Trim Spot Wrap Dress" , "$29.00"))
        FoList.add(Best_Selling_Item(R.drawable.best_selling_two, "Leaf Floral Print Random" , "$29.00"))
        FoList.add(Best_Selling_Item(R.drawable.best_selling_three, "Drop Shoulder Geo Pattern" , "$29.00"))

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Best_Selling_Adapter(FoList)
    }
}
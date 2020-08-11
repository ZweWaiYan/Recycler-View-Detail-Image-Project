package com.letuse.recyclerview2seconddetailsimageproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Discover_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Model.Discover_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.fragment__discover.*

class Fragment_Discover : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__discover, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var FList = ArrayList<Discover_Item>()

        FList.add(Discover_Item(R.drawable.discover_chairs, "Chairs" , "1126"))
        FList.add(Discover_Item(R.drawable.discover_table, "Tables" , "442"))
        FList.add(Discover_Item(R.drawable.discover_sofa, "Sofa" , "1865"))

        recyclerView.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = Discover_Adapter(FList)
    }
}
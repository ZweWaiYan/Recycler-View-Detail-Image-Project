package com.letuse.recyclerview2seconddetailsimageproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Trending_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Model.Trending_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.fragment__discover.*

class Fragment_Trending : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__trending, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var SList = ArrayList<Trending_Item>()

        //R.drawable.image_name
        SList.add(Trending_Item(R.drawable.trending_one , "Ivonne Chair, green" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_two , "Snakeskin Pattern Buckle" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_three , "Armchair Konna green" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_one , "Ivonne Chair, green" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_two , "Snakeskin Pattern Buckle" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_three , "Armchair Konna green" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_one , "Ivonne Chair, green" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_two , "Snakeskin Pattern Buckle" , "\$29.00"))
        SList.add(Trending_Item(R.drawable.trending_three , "Armchair Konna green" , "\$29.00"))

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = Trending_Adapter(SList)

    }
}
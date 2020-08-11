package com.letuse.recyclerview2seconddetailsimageproject.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Collection_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Adapter.Discover_Adapter
import com.letuse.recyclerview2seconddetailsimageproject.Model.Collection_Item
import com.letuse.recyclerview2seconddetailsimageproject.Model.Discover_Item
import com.letuse.recyclerview2seconddetailsimageproject.R
import kotlinx.android.synthetic.main.fragment__discover.*

class Fragment_Collection : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var TList = ArrayList<Collection_Item>()

        TList.add(Collection_Item("Winter"))
        TList.add(Collection_Item("Summer"))
        TList.add(Collection_Item("Raining"))

        recyclerView.layoutManager = LinearLayoutManager(context , LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = Collection_Adapter(TList)
    }
}
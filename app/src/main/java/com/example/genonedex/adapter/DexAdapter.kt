package com.example.genonedex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.genonedex.R
import com.example.genonedex.model.DexScrollEntry

class DexAdapter(
    private val dexScrollEntries: List<DexScrollEntry>
): RecyclerView.Adapter<DexAdapter.ItemViewHolder>() {

    // setting up the variables that represent what will be shown for each dex entry
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val dexEntryNo: TextView = view.findViewById(R.id.dexEntryNo)
        val dexEntrySprite: ImageView = view.findViewById(R.id.dexEntryImage)
        val dexEntryName: TextView = view.findViewById(R.id.dexEntryName)
    }

    // invoked by the layout manager to create new viewholders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dexScrollEntries.size

    // invoked by layout manager to bind/attach a specific view to a specific view holder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dexScrollEntries[position]


    }
}
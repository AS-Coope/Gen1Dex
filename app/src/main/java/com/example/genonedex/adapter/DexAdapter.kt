package com.example.genonedex.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.genonedex.DetailsActivity
import com.example.genonedex.R
import com.example.genonedex.model.DexScrollEntry

class DexAdapter(
    val context: Context,
    private val dexScrollEntries: List<DexScrollEntry>
): RecyclerView.Adapter<DexAdapter.ItemViewHolder>() {

    // setting up the variables that represent what will be shown for each dex entry
    inner class ItemViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        val dexEntryNo: TextView = view.findViewById(R.id.dexEntryNo)
        val dexEntrySprite: ImageView = view.findViewById(R.id.dexEntryImage)
        val dexEntryName: TextView = view.findViewById(R.id.dexEntryName)

        init {
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            Toast.makeText(context, "${dexEntryName.text} at $adapterPosition clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("DEX_ENTRY", adapterPosition)
            context.startActivity(intent)
        }

    }

    // invoked by the layout manager to create new viewholders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DexAdapter.ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dexScrollEntries.size

    // invoked by layout manager to bind/attach a specific view to a specific view holder
    override fun onBindViewHolder(holder: DexAdapter.ItemViewHolder, position: Int) {
        val item = dexScrollEntries[position]

        holder.dexEntryName.setText(item.name)
        holder.dexEntryNo.setText(item.dexNo)
        holder.dexEntrySprite.setImageResource(item.miniSprite)
    }
}
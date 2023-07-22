package com.example.genonedex.data

import com.example.genonedex.R
import com.example.genonedex.model.DexScrollEntry

class DexDataSource {

    // formats the data to be presented on the Recycler View
    fun loadScrollEntry(): List<DexScrollEntry>{
        return listOf(
            DexScrollEntry(R.string.bulbasaur_dex_no, R.drawable.bulbasaur_item_sprite, R.string.bulbasaur_name),
            DexScrollEntry(R.string.ivysaur_dex_no, R.drawable.ivysaur_item_sprite, R.string.ivysaur_name),
            DexScrollEntry(R.string.venusaur_dex_no, R.drawable.venusaur_item_sprite, R.string.venusaur_name)
        )
    }

    // formats the data to be presented in the description entry page
    fun loadDescEntry(){

    }
}
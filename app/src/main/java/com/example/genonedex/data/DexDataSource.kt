package com.example.genonedex.data

import com.example.genonedex.R
import com.example.genonedex.model.DexScrollEntry

class DexDataSource {

    // formats the data to be presented on the Recycler View
    fun loadScrollEntry(): List<DexScrollEntry>{
        return listOf(
            DexScrollEntry(R.string.bulbasaur_dex_no, R.drawable.bulbasaur_item_sprite, R.string.bulbasaur_name)
        )
    }

    // formats the data to be presented in the description entry page
    fun loadDescEntry(){

    }
}
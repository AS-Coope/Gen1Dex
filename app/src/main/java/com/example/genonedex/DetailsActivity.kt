package com.example.genonedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.genonedex.data.DexDataSource
import com.example.genonedex.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val dexScrollEntries = DexDataSource().loadDescEntry()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dexEntryId = intent.getIntExtra("DEX_ENTRY", -1)

        fetchDexEntry(dexEntryId)

    }

    private fun fetchDexEntry(dexEntryId: Int) {
        binding.detailsDexImage.setImageResource(dexScrollEntries[dexEntryId].regSprite)
        binding.dexEntryName.setText(dexScrollEntries[dexEntryId].name)
        binding.dexEntrySpecies.setText(dexScrollEntries[dexEntryId].dexSpecies)
        binding.dexEntryType.setText(dexScrollEntries[dexEntryId].type1)
        binding.dexEntryWeight.setText(dexScrollEntries[dexEntryId].weight)
        binding.dexEntryHeight.setText(dexScrollEntries[dexEntryId].height)
        binding.dexEntryDetails.setText(dexScrollEntries[dexEntryId].desc)

    }
}
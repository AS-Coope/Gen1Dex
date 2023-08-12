package com.example.genonedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.genonedex.data.DexDataSource
import com.example.genonedex.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dexEntryId = intent.getStringExtra("DEX_ENTRY")
        val dexScrollEntries = DexDataSource().loadDescEntry()

        val dexEntryDetails = fetchDexEntry(dexEntryId)
    }

    private fun fetchDexEntry(dexEntryId: String?) {

    }
}
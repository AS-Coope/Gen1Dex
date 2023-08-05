package com.example.genonedex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.genonedex.adapter.DexAdapter
import com.example.genonedex.data.DexDataSource
import com.example.genonedex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dexScrollEntries = DexDataSource().loadScrollEntry()

        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.mainRecyclerView.adapter = DexAdapter(this, dexScrollEntries)
        binding.mainRecyclerView.setHasFixedSize(true)

    }
}
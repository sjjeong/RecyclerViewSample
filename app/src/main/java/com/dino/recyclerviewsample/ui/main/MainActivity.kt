package com.dino.recyclerviewsample.ui.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dino.recyclerviewsample.R
import com.dino.recyclerviewsample.databinding.ActivityMainBinding
import com.dino.recyclerviewsample.ui.main.item.ButtonItem
import com.dino.recyclerviewsample.ui.main.item.MainItem
import com.dino.recyclerviewsample.ui.main.item.TextItem
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.recyclerView.adapter = adapter
        adapter.submitList(
            List(100) {
                val type = MainItem.ItemViewType.entries[Random.nextInt(2)]
                when (type) {
                    MainItem.ItemViewType.TEXT_ITEM -> TextItem(it.toLong(), "Text Item $it")
                    MainItem.ItemViewType.BUTTON_ITEM -> ButtonItem(it.toLong(), "Button Item $it")
                }
            }
        )
    }
}

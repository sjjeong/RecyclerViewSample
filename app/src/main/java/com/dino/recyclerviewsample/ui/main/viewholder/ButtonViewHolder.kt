package com.dino.recyclerviewsample.ui.main.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dino.recyclerviewsample.base.BaseViewHolder
import com.dino.recyclerviewsample.databinding.ItemButtonBinding
import com.dino.recyclerviewsample.ui.main.item.ButtonItem

class ButtonViewHolder(
    parent: ViewGroup,
    private val handler: Handler,
) : BaseViewHolder<ButtonItem, ItemButtonBinding>(ItemButtonBinding.inflate(LayoutInflater.from(parent.context))) {
    init {
        binding.button.setOnClickListener {
            handler.onButtonItemClicked(item)
        }
    }

    override fun bind(item: ButtonItem) {
        super.bind(item)
        binding.button.text = item.text
    }

    interface Handler {
        fun onButtonItemClicked(item: ButtonItem)
    }
}

package com.dino.recyclerviewsample.ui.main.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dino.recyclerviewsample.base.BaseViewHolder
import com.dino.recyclerviewsample.databinding.ItemButtonBinding
import com.dino.recyclerviewsample.ui.main.item.ButtonItem

class ButtonViewHolder(
    parent: ViewGroup,
) : BaseViewHolder<ButtonItem, ItemButtonBinding>(ItemButtonBinding.inflate(LayoutInflater.from(parent.context))) {
    override fun bind(item: ButtonItem) {
        binding.button.text = item.text
    }
}

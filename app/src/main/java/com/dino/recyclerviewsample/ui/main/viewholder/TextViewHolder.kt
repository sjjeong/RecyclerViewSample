package com.dino.recyclerviewsample.ui.main.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dino.recyclerviewsample.base.BaseViewHolder
import com.dino.recyclerviewsample.databinding.ItemTextBinding
import com.dino.recyclerviewsample.ui.main.item.TextItem

class TextViewHolder(
    parent: ViewGroup,
) : BaseViewHolder<TextItem, ItemTextBinding>(ItemTextBinding.inflate(LayoutInflater.from(parent.context))) {
    override fun bind(item: TextItem) {
        binding.textView.text = item.text
    }
}

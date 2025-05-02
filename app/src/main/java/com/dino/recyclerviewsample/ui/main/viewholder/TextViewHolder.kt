package com.dino.recyclerviewsample.ui.main.viewholder

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dino.recyclerviewsample.base.BaseViewHolder
import com.dino.recyclerviewsample.databinding.ItemTextBinding
import com.dino.recyclerviewsample.ui.main.item.TextItem

class TextViewHolder(
    parent: ViewGroup,
    private val handler: Handler,
) : BaseViewHolder<TextItem, ItemTextBinding>(ItemTextBinding.inflate(LayoutInflater.from(parent.context))) {
    init {
        binding.textView.setOnClickListener {
            handler.onTextItemClicked(item)
        }
    }

    override fun bind(item: TextItem) {
        super.bind(item)
        binding.textView.text = item.text
    }

    interface Handler {
        fun onTextItemClicked(item: TextItem)
    }
}

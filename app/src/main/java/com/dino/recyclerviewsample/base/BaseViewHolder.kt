package com.dino.recyclerviewsample.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<ITEM : BaseViewHolderItem, BINDING : ViewBinding>(
    protected val binding: BINDING,
) : RecyclerView.ViewHolder(binding.root) {
    abstract fun bind(item: ITEM)
}

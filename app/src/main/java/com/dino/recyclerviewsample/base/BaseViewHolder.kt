package com.dino.recyclerviewsample.base

import androidx.annotation.CallSuper
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<ITEM : BaseViewHolderItem, BINDING : ViewBinding>(
    protected val binding: BINDING,
) : RecyclerView.ViewHolder(binding.root) {
    protected lateinit var item: ITEM

    @CallSuper
    open fun bind(item: ITEM) {
        this.item = item
    }
}

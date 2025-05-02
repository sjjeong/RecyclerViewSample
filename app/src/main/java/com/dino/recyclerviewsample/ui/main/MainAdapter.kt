package com.dino.recyclerviewsample.ui.main

import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.dino.recyclerviewsample.base.BaseListAdapter
import com.dino.recyclerviewsample.base.BaseViewHolder
import com.dino.recyclerviewsample.ui.main.item.MainItem
import com.dino.recyclerviewsample.ui.main.viewholder.ButtonViewHolder
import com.dino.recyclerviewsample.ui.main.viewholder.TextViewHolder

class MainAdapter : BaseListAdapter<MainItem, BaseViewHolder<MainItem, ViewBinding>>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MainItem, ViewBinding> {
        return when (MainItem.ItemViewType.entries[viewType]) {
            MainItem.ItemViewType.TEXT_ITEM -> TextViewHolder(parent)
            MainItem.ItemViewType.BUTTON_ITEM -> ButtonViewHolder(parent)
        } as BaseViewHolder<MainItem, ViewBinding>
    }
}

package com.dino.recyclerviewsample.ui.main.item

import com.dino.recyclerviewsample.base.BaseViewHolderItem

sealed class MainItem(itemViewType: ItemViewType) : BaseViewHolderItem {
    override val viewType: Int = itemViewType.ordinal

    enum class ItemViewType {
        TEXT_ITEM,
        BUTTON_ITEM
    }
}

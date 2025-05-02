package com.dino.recyclerviewsample.ui.main.item

data class ButtonItem(
    override val id: Long,
    val text: String,
) : MainItem(ItemViewType.BUTTON_ITEM)

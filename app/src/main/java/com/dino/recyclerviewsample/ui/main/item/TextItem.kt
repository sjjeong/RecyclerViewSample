package com.dino.recyclerviewsample.ui.main.item

data class TextItem(
    override val id: Long,
    val text: String,
) : MainItem(ItemViewType.TEXT_ITEM)

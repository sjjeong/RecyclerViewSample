package com.dino.recyclerviewsample.base

interface BaseViewHolderItem {
    val id: Long
    val viewType: Int

    override operator fun equals(item: Any?): Boolean
}

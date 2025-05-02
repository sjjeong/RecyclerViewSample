package com.dino.recyclerviewsample.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.viewbinding.ViewBinding

abstract class BaseListAdapter<ITEM : BaseViewHolderItem, VH : BaseViewHolder<ITEM, ViewBinding>>(
    diffCallback: DiffUtil.ItemCallback<ITEM> = object : DiffUtil.ItemCallback<ITEM>() {
        override fun areItemsTheSame(oldItem: ITEM, newItem: ITEM): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ITEM, newItem: ITEM): Boolean {
            return oldItem == newItem
        }
    },
) : ListAdapter<ITEM, VH>(diffCallback) {

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).viewType
    }
}

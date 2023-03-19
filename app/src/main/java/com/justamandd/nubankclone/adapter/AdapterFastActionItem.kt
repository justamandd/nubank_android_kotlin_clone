package com.justamandd.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.justamandd.nubankclone.databinding.FastActionItemBinding
import com.justamandd.nubankclone.model.FastActionItem

class AdapterFastActionItem (
    private val context: Context,
    private val fastActionItem: MutableList<FastActionItem>)
    : RecyclerView.Adapter<AdapterFastActionItem.FastActionItemHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FastActionItemHolder {
        val fastActionItemElements = FastActionItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return FastActionItemHolder(fastActionItemElements)
    }

    override fun getItemCount(): Int = fastActionItem.size

    override fun onBindViewHolder(holder: FastActionItemHolder, position: Int) {
        holder.iconFastActionItem.setBackgroundResource(fastActionItem[position].icon!!)
        holder.txtLabelFastActionItem.text = fastActionItem[position].label
    }

    inner class FastActionItemHolder(binding: FastActionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val iconFastActionItem = binding.icItem
        val txtLabelFastActionItem = binding.txtLabelFastActionItem
    }
}
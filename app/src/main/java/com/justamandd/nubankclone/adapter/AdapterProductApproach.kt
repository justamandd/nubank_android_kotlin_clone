package com.justamandd.nubankclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.justamandd.nubankclone.databinding.ProductItemBinding
import com.justamandd.nubankclone.model.ProductApproach

class AdapterProductApproach(
    private val context: Context,
    private val productApproach: MutableList<ProductApproach>
) : RecyclerView.Adapter<AdapterProductApproach.ProductApproachViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductApproachViewHolder {
        val productApproachElement = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductApproachViewHolder(productApproachElement)
    }

    override fun getItemCount(): Int = productApproach.size

    override fun onBindViewHolder(holder: ProductApproachViewHolder, position: Int) {
        holder.txtProductApproach.text = productApproach[position].text
    }

    inner class ProductApproachViewHolder(binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val txtProductApproach = binding.txtProductApproach
    }
}

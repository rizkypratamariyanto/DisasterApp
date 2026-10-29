package com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter(
    private val listDisaster : List<Disaster>) :
    RecyclerView.Adapter<DisasterAdapter
        .ItemDisterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemDisterViewHolder {
        val binding = ItemDisasterBinding.inflate(
            LayoutInflater.from(parent.context), parent,
            false)
            return ItemDisterViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemDisterViewHolder, position:
    Int) {
    }

    override fun getItemCount(): Int {
        return 5
    }

    inner class ItemDisterViewHolder (
        private val binding: ItemDisasterBinding):
        RecyclerView.ViewHolder(binding.root){

        }
}

package com.example.farmaplus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MedicineAdapter(private val medicineList:List<Medicine>): RecyclerView.Adapter<MedicineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MedicineViewHolder(layoutInflater.inflate(R.layout.item_medicine, parent, false))
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        val item = medicineList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = medicineList.size

}
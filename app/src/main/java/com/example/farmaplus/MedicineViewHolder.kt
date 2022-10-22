package com.example.farmaplus

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MedicineViewHolder(view: View):ViewHolder(view){

    val medicine = view.findViewById<TextView>(R.id.tvMedicine)
    val medicineLaboratory = view.findViewById<TextView>(R.id.tvMedicineLab)
    val medicinePhoto = view.findViewById<ImageView>(R.id.ivMedicine)

    fun render(medicineModel: Medicine){
        medicine.text = medicineModel.name
        medicineLaboratory.text = medicineModel.laboratory
    }
}
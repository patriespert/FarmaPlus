package com.example.farmaplus

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*lifecycleScope.launch {
            val call = RemoteConnection.service.getMedicines(1,1,1)
            val result = call.body()
            if(call.isSuccessful){
                val medicines = result?.medicines ?: emptyList()
                Log.d("Medicines", medicines.toString())
            }else{
                showError()
            }

        }*/

        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerMedicine)
        recyclerView.layoutManager = LinearLayoutManager(this)
        lifecycleScope.launch {
            val call = RemoteConnection.service.getMedicines(1,1,1)
            val result = call.body()
            if(call.isSuccessful){
                val medicines = result?.medicines ?: emptyList()
                recyclerView.adapter = MedicineAdapter(medicines)
                //Log.d("Medicines", medicines.toString())
            }else{
                showError()
            }

        }
    }


    private fun showError(){
        toast("Ha ocurrido un error.")
    }
}

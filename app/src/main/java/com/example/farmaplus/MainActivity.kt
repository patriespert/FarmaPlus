package com.example.farmaplus

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.farmaplus.databinding.ActivityMainBinding
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.recyclerMedicine.layoutManager = LinearLayoutManager(this)
        lifecycleScope.launch{
            val call = RemoteConnection.service.getMedicines(1,1,1)
            val result = call.body()
            if(call.isSuccessful) {
                val medicines = result?.medicines ?: emptyList()
                binding.recyclerMedicine.adapter = MedicineAdapter(medicines)
            }else{
                showError()
            }

        }
    }

    private fun showError(){
        toast("Ha ocurrido un error.")
    }
}

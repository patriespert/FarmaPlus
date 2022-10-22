package com.example.farmaplus

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {
            val call = RemoteConnection.service.getMedicines(1,1,1)
            val result = call.body()
            if(call.isSuccessful){
                val medicines = result?.medicines ?: emptyList()
                Log.d("Medicines", medicines.toString())
            }else{
                showError()
            }

        }
    }


    private fun showError(){
        toast("Ha ocurrido un error.")
    }


    /*private fun parseDateExample(epochTimestamp:Long) {
        val timeStamp = Timestamp(epochTimestamp)
        val dateToParse = Date(timeStamp.time)
//        Log.d("Mg-date", dateToParse.toString())
        val dateFormat = "EEE d MMM HH:mm:ss z yyyy"
        val sdf = SimpleDateFormat(dateFormat, Locale.getDefault())
        try {
            val date: Date = sdf.parse(dateToParse.toString())
            Log.d("Mg-date", date.toString())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }*/
}

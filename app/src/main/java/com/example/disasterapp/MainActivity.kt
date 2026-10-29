package com.example.disasterapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.annotation.BinderThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapterDisaster = DisasterAdapter()
        with(binding){
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }
    fun geenrateDummy(): List<Disaster>{
        return listOf(
            Disaster(nameDisaster = "Tsunami", disasterType = "natural"),
            Disaster(nameDisaster = "Earthquake", disasterType = "Natural"),
            Disaster(nameDisaster = "Flood", disasterType = "Natural"),
            Disaster(nameDisaster = "Fire", disasterType = "Natural"),
            Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made"),
            Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made"),
            Disaster(nameDisaster = "War", disasterType = "Man-made")
        )
    }
}
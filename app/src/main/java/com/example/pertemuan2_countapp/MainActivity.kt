package com.example.pertemuan2_countapp

import android.R
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan2_countapp.databinding.ActivityMainBinding

// bikin variabel untul binding
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        //sekarang kita bisa akses ui element di code bloc:
        with(binding){

        }
    }
}
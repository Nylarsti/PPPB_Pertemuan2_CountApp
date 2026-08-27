package com.example.pertemuan2_countapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan2_countapp.databinding.ActivityMainBinding

// bikin variabel untul binding
private lateinit var binding: ActivityMainBinding

var counter = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisiasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        //set content dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        //sekarang kita bisa akses ui element di code bloc:
        with(binding){
            // akses ui by id
            tvNumber.text = counter.toString()

            //ketika button count click
            btnCount.setOnClickListener {
                counter++
                tvNumber.text = counter.toString()
            }

            //ketika button toast click
            btnToast.setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "Counter: $counter",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }

        }
    }
}
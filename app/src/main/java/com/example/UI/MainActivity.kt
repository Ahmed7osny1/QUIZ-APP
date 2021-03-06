package com.example.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Handle click , login
        binding.loginBtn.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        //hand click, skip and continue to main screen
        binding.skipBtn.setOnClickListener {

            startActivity(Intent(this, CardViewActivity::class.java))
            finish()
        }

    }
}
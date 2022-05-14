package com.example.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //handel back button click
        binding.backBtn.setOnClickListener {
            onBackPressed()   //go to previous screen
        }
        //handel click, begin register
        binding.registerBtn.setOnClickListener {
            startActivity(Intent(this, CardViewActivity::class.java))
        }

    }
}
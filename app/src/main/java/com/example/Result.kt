package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.UI.CardViewActivity
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var total_res = intent.getStringExtra("total_score")
        var your_res = intent.getStringExtra("que_score")


        txt_score.text = "${your_res} / ${total_res}"

        finish.setOnClickListener {
            var i = Intent(this , CardViewActivity::class.java )
            startActivity(i)
            finish()
        }
    }
}
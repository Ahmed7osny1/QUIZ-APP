package com.example.UI

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.QuizActivity
import com.example.R
import com.example.databinding.ActivityCardViewBinding
import com.example.databinding.ActivityMainBinding

class CardViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCardViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.elanhw.setOnClickListener{
            showDialog()
        }

        binding.bla3a.setOnClickListener {
            var i = Intent(this,QuizActivity::class.java)
            startActivity(i)
            finish()
        }

    }

    private fun showDialog(){

        val builder = AlertDialog.Builder(this)

        val textView = TextView(this)

        with(textView) {
            textView.text = "حصص مصر"
            textView.textSize = 25.0F
            textView.gravity = Gravity.CENTER
        }

        builder.apply {
            setCustomTitle(textView)
            setMessage("سوف يضاف لاحقا")
        }
        val dialog = builder.create()
        dialog.show()
    }
}
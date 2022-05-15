package com.example.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.albalagha.QuizActivity
import com.example.alnahw.alnahwQuestion
import com.example.databinding.ActivityCardViewBinding
import kotlinx.android.synthetic.main.activity_card_view.*

class CardViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCardViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alnahwview.setOnClickListener{
            var i = Intent(this, alnahwQuestion::class.java)
            startActivity(i)
            finish()
        }

        binding.bla3a.setOnClickListener {
            var i = Intent(this, QuizActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.eladb.setOnClickListener {
            showDialog()
        }

        binding.elksa.setOnClickListener {
            showDialog()
        }

        binding.alkraa.setOnClickListener {
            showDialog()
        }

        binding.alnsos.setOnClickListener {
            showDialog()
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
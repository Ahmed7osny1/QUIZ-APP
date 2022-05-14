package com.example.UI

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding : ActivityLoginBinding

    //progress dialog
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handel back button click
        binding.backBtn.setOnClickListener {
            onBackPressed()   //go to previous screen
        }

        //init progress dialog
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Please Wait")
        progressDialog.setCanceledOnTouchOutside(false)


        //handle click not have account , go to register screen
        binding.noAccountTv.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        //handle click, begin login
        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this, CardViewActivity::class.java))
        }
/*
        //handle click, begin login
        binding.loginBtn.setOnClickListener {
            /*steps
            * 1) input data
            * 2) validate data
            * 3) check user type */
            validateData()
        }

    }

    private var email = ""
    private var password = ""

    private fun validateData() {
        // 1) input data
        email = binding.emailEt.text.toString().trim()
        password = binding.passwordEt.text.toString().trim()

        //2) validate data
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Toast.makeText(this, "Invalid email format...", Toast.LENGTH_SHORT).show()
        }
        else if (password.isEmpty()){
            Toast.makeText(this, "Enter password...", Toast.LENGTH_SHORT).show()
        }

    }

    private fun checkUser() {
        /*3) check user type */

        progressDialog.setMessage("Checking User...")
        if ( password !=null)
          startActivity(Intent(this@LoginActivity,CardViewActivity::class.java))
          finish()
*/
        }
}

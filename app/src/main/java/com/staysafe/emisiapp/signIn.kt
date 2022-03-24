package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class signIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlogin: Button
    private lateinit var txtview: TextView
    private lateinit var user: EditText
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        txtview = findViewById(R.id.txtsignup)
        txtview.setOnClickListener(this)

        btnlogin = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener(this)

        user = findViewById(R.id.username)
        pass = findViewById(R.id.passwordlogin)
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login ->{
                if (user.text.toString() == "admin" && pass.text.toString() == "admin") {
                    startActivity(Intent(this, homeActivity::class.java))
                    Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
                }
            }
            R.id.txtsignup ->{
                val intentBiasa = Intent(this@signIn,signUp::class.java)
                startActivity(intentBiasa)
            }
        }
    }


}
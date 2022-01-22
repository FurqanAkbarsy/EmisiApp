package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class opsialat : AppCompatActivity(), View.OnClickListener {

    private lateinit var Btnhitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opsialat)

        Btnhitung = findViewById(R.id.btnhitung)
        Btnhitung.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnhitung -> {
                val intent = Intent(this@opsialat, hitung_alatelektronik::class.java)
                startActivity(intent)
            }
        }
    }
}
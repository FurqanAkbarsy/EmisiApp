package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class homeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnfragment : ImageButton
    private lateinit var btnimage : ImageView
    private lateinit var btnimage1 : ImageView
    private lateinit var btnimage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnfragment  = findViewById(R.id.btnelektronik)
        btnfragment.setOnClickListener(this)

        btnimage = findViewById(R.id.btnprofil)
        btnimage.setOnClickListener(this)

        btnimage1  = findViewById(R.id.btnsampah)
        btnimage1.setOnClickListener(this)

        btnimage2  = findViewById(R.id.btntransportasi)
        btnimage2.setOnClickListener(this)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomnav)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)

    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnprofil -> {
                val intent1 = Intent(this@homeActivity, profilActivity::class.java)
                startActivity(intent1)
            }
            R.id.btnelektronik -> {
                val intent2 = Intent(this@homeActivity, opsialat::class.java)
                startActivity(intent2)
            }
            R.id.btnsampah -> {
                val intent3 = Intent(this@homeActivity, hitung_sampah::class.java)
                startActivity(intent3)
            }
            R.id.btntransportasi -> {
                val intent4 = Intent(this@homeActivity, hitung_transportasi_mobil::class.java)
                startActivity(intent4)
            }
        }
    }

}





package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.staysafe.emisiapp.databinding.FragmentHistoryBinding

class pantauActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnhistory : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantau)

        btnhistory = findViewById(R.id.btnHistory2)
        btnhistory.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnHistory2 ->{
                val intentBiasa = Intent(this@pantauActivity, homeActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}



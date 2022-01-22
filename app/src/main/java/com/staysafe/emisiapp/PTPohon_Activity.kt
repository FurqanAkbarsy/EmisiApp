package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.NumberPicker
import kotlin.math.max

class PTPohon_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var npicker : NumberPicker
    private lateinit var  btnTanam : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ptpohon)

        btnTanam = findViewById(R.id.btntanam)
        btnTanam.setOnClickListener(this)

        npicker = findViewById(R.id.numberPicker)

        npicker.minValue=0
        npicker.maxValue= 1000

    }

        override fun onClick(v: View) {
            when(v.id){
                R.id.btntanam ->{
                    val intentBiasa = Intent(this@PTPohon_Activity, pantauActivity::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
}





package com.staysafe.emisiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import kotlin.math.max

class PTPohon_Activity : AppCompatActivity() {

    private lateinit var npicker : NumberPicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ptpohon)

        npicker = findViewById(R.id.numberPicker)

        npicker.minValue=0
        npicker.maxValue= 1000

    }
}



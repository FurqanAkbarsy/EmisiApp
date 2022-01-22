package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class TPohonActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var Tview1 : TextView
    private lateinit var Tview2 : TextView
    private lateinit var Tview3 : TextView
    private lateinit var Tview4 : TextView
    private lateinit var Tview5 : TextView
    private lateinit var Tview6 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tpohon)

        Tview1 = findViewById(R.id.tview1)
        Tview1.setOnClickListener(this)

        Tview2 = findViewById(R.id.tview2)
        Tview2.setOnClickListener(this)

        Tview3 = findViewById(R.id.tview3)
        Tview3.setOnClickListener(this)

        Tview4 = findViewById(R.id.tview4)
        Tview4.setOnClickListener(this)

        Tview5 = findViewById(R.id.tview5)
        Tview5.setOnClickListener(this)

        Tview6 = findViewById(R.id.tview6)
        Tview6.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tview1 ->{
                val intentBiasa1 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa1)
            }
            R.id.tview2 ->{
                val intentBiasa2 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa2)
            }
            R.id.tview3 ->{
                val intentBiasa2 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa2)
            }
            R.id.tview4 ->{
                val intentBiasa2 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa2)
            }
            R.id.tview5 ->{
                val intentBiasa2 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa2)
            }
            R.id.tview6 ->{
                val intentBiasa2 = Intent(this@TPohonActivity,PTPohon_Activity::class.java)
                startActivity(intentBiasa2)
            }
        }
    }

}



package com.staysafe.emisiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import com.staysafe.emisiapp.databinding.FragmentHomeBinding
import android.content.Intent as Intent


class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        val bind = FragmentHomeBinding.inflate(layoutInflater)

        bind.btnprofil.setOnClickListener {
            val intent = Intent(this.context, profilActivity::class.java)
            startActivity(intent)
        }
        bind.btnelektronik.setOnClickListener {
            val intent = Intent(this.context, opsialat::class.java)
            startActivity(intent)
        }
        bind.btnsampah.setOnClickListener {
            val intent = Intent(this.context, hitung_sampah::class.java)
            startActivity(intent)
        }
        bind.btntransportasi.setOnClickListener {
            val intent = Intent(this.context, hitung_transportasi_mobil::class.java)
            startActivity(intent)
        }
        bind.btntanampohon.setOnClickListener {
            val intent = Intent(this.context, TPohonActivity::class.java)
            startActivity(intent)
        }
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}






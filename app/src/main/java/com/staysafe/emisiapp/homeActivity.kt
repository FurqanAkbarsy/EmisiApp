package com.staysafe.emisiapp

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class homeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnfragment : ImageButton
    private lateinit var btnimage : ImageView
    private lateinit var btnimage1 : ImageView
    private lateinit var btnimage2 : ImageView
    private lateinit var btn1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var AirplaneReceiver = MyAirplaneReceiver()
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(AirplaneReceiver,filter)

        btnfragment  = findViewById(R.id.btnelektronik)
        btnfragment.setOnClickListener(this)

        btnimage = findViewById(R.id.btnprofil)
        btnimage.setOnClickListener(this)

        btnimage1  = findViewById(R.id.btnsampah)
        btnimage1.setOnClickListener(this)

        btnimage2  = findViewById(R.id.btntransportasi)
        btnimage2.setOnClickListener(this)

        btn1  = findViewById(R.id.btnartikel)
        btn1.setOnClickListener(this)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomnav)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sumber.belajar.kemdikbud.go.id/repos/FileUpload/efek%20rumah%20kaca-%20BPSMG/materi1.html")).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent: PendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)

            val builder = NotificationCompat.Builder(this, "CHANNEL_ID")
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Efek Rumah Kaca")
                .setContentText("Klik notifikasi ini untuk ke halaman artikel")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                // Set the intent that will fire when the user taps the notification
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)

            with(NotificationManagerCompat.from(this)) {
                // notificationId is a unique int for each notification that you must define
                notify(0, builder.build())

                createNotificationChannel()
            }
        }

    }

    private fun createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel("CHANNEL_ID", name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
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





package com.jeegnathebug.literatepancake

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButtonHandlers()
    }

    private fun addButtonHandlers() {
        val mediaPlayerPayne = MediaPlayer.create(this, R.raw.payne)
        val btnPayne = findViewById<Button>(R.id.btn_payne)
        btnPayne.setOnClickListener {
            mediaPlayerPayne.start()
        }
        val btnStables = findViewById<Button>(R.id.btn_stables)
        btnStables.setOnClickListener {

        }
    }
}

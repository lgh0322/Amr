package com.example.amr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var amrAudioEncoder= AmrAudioEncoder.getArmAudioEncoderInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        amrAudioEncoder.initArmAudioEncoder(this)
        Thread.sleep(5000)
        Thread{
            amrAudioEncoder.start()
        }.start()

    }
}
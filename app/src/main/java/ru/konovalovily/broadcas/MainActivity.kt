package ru.konovalovily.broadcas

import android.content.BroadcastReceiver
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var br: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        br = BroadcastHandler()
        val filter = IntentFilter("TITLE")
        registerReceiver(br, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(br)
    }
}
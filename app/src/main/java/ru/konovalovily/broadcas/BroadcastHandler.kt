package ru.konovalovily.broadcas

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BroadcastHandler: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            intent.getStringExtra("TITLE")?.let { Log.d("TAG", it) }
            intent.getStringExtra("TITLE2")?.let { Log.d("TAG", it) }
        }
    }
}
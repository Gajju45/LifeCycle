package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    val  Tag="SecondActivityLog"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun onStart() {
        Log.d(Tag,"OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(Tag,"OnResume")
        super.onResume()
    }
    override fun onPause() {
        Log.d(Tag,"OnPaus")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Tag,"OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(Tag,"OnDestroyed")
        super.onDestroy()
    }


}

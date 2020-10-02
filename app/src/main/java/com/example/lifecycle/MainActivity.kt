package com.example.lifecycle

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val Tag = "MainActivityLog"
    var isLogIn = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Tag, "onCreate")
        setContentView(R.layout.activity_main)
         button.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }


    }

    override fun onRestart() {
        Log.d(Tag, "OnReStart")
        super.onRestart()
    }

    override fun onStart() {
        Log.d(Tag, "OnStart")
        super.onStart()
        //hecklogIn()
    }

    override fun onResume() {
        Log.d(Tag, "OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(Tag, "OnPaus")
        super.onPause()
    }

    override fun onStop() {
        Log.d(Tag, "OnStop")
        super.onStop()
        isLogIn=false
    }

    override fun onDestroy() {
        Log.d(Tag, "OnDestroyed")
        super.onDestroy()
    }

     fun askPermission(){
        Log.d(Tag,"askPermissionCalled")
    }




    fun checklogIn() {
    if (isLogIn)
    {
        Log.d(Tag, "LogIn")
    }else
        Log.d(Tag, "Log Out")
}




}
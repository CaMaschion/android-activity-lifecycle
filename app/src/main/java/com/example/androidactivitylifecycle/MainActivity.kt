package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.androidactivitylifecycle.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    val STATE = "Dados"
    var state: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(applicationContext, "onCreate", LENGTH_SHORT).show()
        Log.d("MainActivity", "onCreate Called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null) {
            state = savedInstanceState.getString(STATE)
        }

        buttonScreen2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", LENGTH_SHORT).show()
        Log.d("MainActivity", "onStart Called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString(STATE)
        Log.d("MainActivity", "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", LENGTH_SHORT).show()
        Log.d("MainActivity", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", LENGTH_SHORT).show()
        Log.d("MainActivity", "onPause Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE, state)
        Log.d("MainActivity", "onSaveInstance")
        Toast.makeText(applicationContext, "onSaveInstance", LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", LENGTH_SHORT).show()
        Log.d("MainActivity", "onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onStop", LENGTH_SHORT).show()
        Log.d("MainActivity", "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", LENGTH_SHORT).show()
        Log.d("MainActivity", "onDestroy Called")
    }
}

package com.gentlekboy.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//This activity holds a splash screen that welcomes users to the app
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
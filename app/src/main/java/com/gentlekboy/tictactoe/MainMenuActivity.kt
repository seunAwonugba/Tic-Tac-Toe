package com.gentlekboy.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//This activity serves as the game's main menu
//It contains navigation links to play the game, rate the app, share the app, report a bug and exit the app
class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }
}
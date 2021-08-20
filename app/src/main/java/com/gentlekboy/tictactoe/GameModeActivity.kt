package com.gentlekboy.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//This activity allows users choose if they want to play with the computer or with a friend
class GameModeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_mode)
    }
}
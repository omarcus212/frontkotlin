package com.example.splahgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class menuframe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuframe)

        supportActionBar?.hide();
    }
}
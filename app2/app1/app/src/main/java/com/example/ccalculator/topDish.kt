package com.example.ccalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_top_dish.*

class topDish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_dish)



        button4.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }






}
package com.arong.googleplayclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arong.googleplayclone.first.FirstActivity
import com.arong.googleplayclone.second.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val firstIntent = Intent(this, FirstActivity::class.java)
            startActivity(firstIntent)
        }
        button2.setOnClickListener {
            val secondIntent = Intent(this, SecondActivity::class.java)
            startActivity(secondIntent)
        }
    }
}
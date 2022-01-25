package com.arong.googleplayclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arong.googleplayclone.first.FirstActivity
import com.arong.googleplayclone.fourth.FourthActivity
import com.arong.googleplayclone.second.SecondActivity
import com.arong.googleplayclone.third.ThirdActivity
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
        button3.setOnClickListener {
            val thirdIntent = Intent(this, ThirdActivity::class.java)
            startActivity(thirdIntent)
        }
        button4.setOnClickListener {
            val fourthIntent = Intent(this, FourthActivity::class.java)
            startActivity(fourthIntent)
        }
    }
}
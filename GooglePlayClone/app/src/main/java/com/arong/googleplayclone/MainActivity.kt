package com.arong.googleplayclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.first.FirstActivity
import com.arong.googleplayclone.fourth.FourthActivity
import com.arong.googleplayclone.second.SecondActivity
import com.arong.googleplayclone.first.List
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mainViewHolder: RecyclerView
    lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





//        val first = ArrayList<List>().apply {
//            add(List(R.drawable.img))
//            add(List(R.drawable.img2))
//            add(List(R.drawable.img))
//            add(List(R.drawable.img2))
//            add(List(R.drawable.img))
//            add(List(R.drawable.img2))
//            add(List(R.drawable.img))
//            add(List(R.drawable.img2))
//            add(List(R.drawable.img))
//            add(List(R.drawable.img2))
//        }
//        val items = ArrayList<ArrayList<MainList>>().apply{
//            add(first)
//        }





    }
}
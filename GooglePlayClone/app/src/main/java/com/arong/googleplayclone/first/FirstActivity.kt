package com.arong.googleplayclone.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.R

class FirstActivity : AppCompatActivity() {

    lateinit var firstViewHolder: RecyclerView
    lateinit var firstAdapter: FirstAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val items = ArrayList<List>().apply {
            add(List(R.drawable.img))
            add(List(R.drawable.img2))
            add(List(R.drawable.img))
            add(List(R.drawable.img2))
            add(List(R.drawable.img))
            add(List(R.drawable.img2))
            add(List(R.drawable.img))
            add(List(R.drawable.img2))
            add(List(R.drawable.img))
            add(List(R.drawable.img2))
        }
        firstAdapter = FirstAdapter(this)
        firstAdapter.setItems(items)
        firstViewHolder = findViewById(R.id.banner)
        firstViewHolder.adapter = firstAdapter
        firstViewHolder.layoutManager = LinearLayoutManager(this).apply { orientation = LinearLayoutManager.HORIZONTAL }

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(firstViewHolder)
    }
}
package com.arong.googleplayclone.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.R

class SecondActivity : AppCompatActivity() {

    lateinit var secondViewHolder: RecyclerView
    lateinit var secondAdapter: SecondAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val items = ArrayList<SecondList>().apply{
            add(SecondList(R.drawable.img2,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지 아레나","4.4"))
            add(SecondList(R.drawable.img4,"솔라 리바이","4.7"))
            add(SecondList(R.drawable.img2,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지 아레나","4.4"))
            add(SecondList(R.drawable.img4,"솔라 리바이","4.7"))
            add(SecondList(R.drawable.img2,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지 아레나","4.4"))
            add(SecondList(R.drawable.img4,"솔라 리바이","4.7"))
        }

        secondAdapter = SecondAdapter(this)
        secondAdapter.setItems(items)
        secondViewHolder = findViewById(R.id.banner2)
        secondViewHolder.adapter = secondAdapter
        secondViewHolder.layoutManager = LinearLayoutManager(this).apply { orientation = LinearLayoutManager.HORIZONTAL}

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(secondViewHolder)
    }
}
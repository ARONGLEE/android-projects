package com.arong.googleplayclone.third

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.CustomLinearSnapHelper
import com.arong.googleplayclone.R

class ThirdActivity: AppCompatActivity() {

    lateinit var thirdViewHolder: RecyclerView
    lateinit var thirdAdapter: ThirdAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val items = ArrayList<ThirdList>().apply{
            add(ThirdList(R.drawable.img4,"이스6온라인","롤플레잉","4.6"))
            add(ThirdList(R.drawable.img3,"드래곤빌리지","롤플레잉","4.4"))
            add(ThirdList(R.drawable.img5,"솔라 리바이","롤플레잉","4.7"))
            add(ThirdList(R.drawable.img4,"이스6온라인","롤플레잉","4.6"))
            add(ThirdList(R.drawable.img3,"드래곤빌리지","롤플레잉","4.4"))
            add(ThirdList(R.drawable.img5,"솔라 리바이","롤플레잉","4.7"))
            add(ThirdList(R.drawable.img4,"이스6온라인","롤플레잉","4.6"))
            add(ThirdList(R.drawable.img3,"드래곤빌리지","롤플레잉","4.4"))
            add(ThirdList(R.drawable.img5,"솔라 리바이","롤플레잉","4.7"))
        }

        thirdAdapter = ThirdAdapter(this)
        thirdAdapter.setItems(items)
        thirdViewHolder = findViewById(R.id.banner3)
        thirdViewHolder.adapter = thirdAdapter
        thirdViewHolder.layoutManager = LinearLayoutManager(this).apply{ orientation = LinearLayoutManager.HORIZONTAL}

        val snapHelper = CustomLinearSnapHelper()
        snapHelper.attachToRecyclerView(thirdViewHolder)

    }
}
package com.arong.googleplayclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.first.FirstActivity
import com.arong.googleplayclone.fourth.FourthActivity
import com.arong.googleplayclone.second.SecondActivity
import com.arong.googleplayclone.first.List
import com.arong.googleplayclone.second.SecondList
import com.arong.googleplayclone.third.ThirdList
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var mainViewHolder: RecyclerView
    lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = ArrayList<MainList>().apply {
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

        val second = ArrayList<MainList>().apply{
            add(SecondList(R.drawable.img4,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지","4.4"))
            add(SecondList(R.drawable.img5,"솔라 리바이","4.7"))
            add(SecondList(R.drawable.img4,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지","4.4"))
            add(SecondList(R.drawable.img5,"솔라 리바이","4.7"))
            add(SecondList(R.drawable.img4,"이스6온라인","4.6"))
            add(SecondList(R.drawable.img3,"드래곤빌리지","4.4"))
            add(SecondList(R.drawable.img5,"솔라 리바이","4.7"))
        }

        val third = ArrayList<MainList>().apply{
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

        val items = ArrayList<ArrayList<MainList>>().apply{
            add(first)
            add(second)
            add(third)
            add(first)
            add(second)
            add(third)
        }

        mainAdapter = MainAdapter(this)
        mainAdapter.setItems(items)

        mainViewHolder = findViewById(R.id.recyclerView)
        mainViewHolder.adapter = mainAdapter
        mainViewHolder.layoutManager = LinearLayoutManager(this).apply { orientation = LinearLayoutManager.VERTICAL }


    }
}
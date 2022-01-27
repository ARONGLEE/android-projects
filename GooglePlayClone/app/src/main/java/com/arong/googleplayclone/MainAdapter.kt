package com.arong.googleplayclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.first.FirstAdapter
import com.arong.googleplayclone.first.List
import com.arong.googleplayclone.second.SecondAdapter
import com.arong.googleplayclone.second.SecondList
import com.arong.googleplayclone.third.ThirdAdapter
import com.arong.googleplayclone.third.ThirdList

class MainAdapter(private val context: Context)  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var firstAdapter: FirstAdapter
    lateinit var secondAdapter: SecondAdapter
    lateinit var thirdAdapter: ThirdAdapter

    lateinit var mItems: ArrayList<ArrayList<MainList>>

    fun setItems(items : ArrayList<ArrayList<MainList>>) {
        mItems = items
    }

    // var items = ArrayList<ArrayList<MainList>>()

    val FIRST = 0
    val SECOND = 1
    val THIRD = 2
    val NON = 4

    override fun getItemViewType(position: Int): Int =
        when (mItems[position][0]) {
            is List -> {
                FIRST
            }
            is SecondList -> {
                SECOND
            }
            is ThirdList -> {
                THIRD
            }
            else -> {
                NON
            }
        }
         // items[position] 이 몇번째 화면의 데이터인가...

    override fun getItemCount() = mItems.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == FIRST){
            val firstView = LayoutInflater.from(parent.context).inflate(R.layout.activity_first, parent, false)

            return RFirstViewHolder(firstView)
        } else if(viewType == SECOND) {
            val secondView = LayoutInflater.from(parent.context).inflate(R.layout.activity_second, parent, false)

            return RSecondViewHolder(secondView)
        } else {
            val thirdView = LayoutInflater.from(parent.context).inflate(R.layout.activity_third, parent, false)

            return RThirdViewHolder(thirdView)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is RFirstViewHolder -> {
               firstAdapter = FirstAdapter(context)
                val item = mItems[position]
                val firstList = ArrayList<List>()
                firstList.addAll(item.map {
                    it as List
                })
               firstAdapter.setItems(firstList)
                holder.recycler.adapter = firstAdapter
                holder.recycler.layoutManager = LinearLayoutManager(context).apply { orientation = LinearLayoutManager.HORIZONTAL }
                val snapHelper = LinearSnapHelper()
                snapHelper.attachToRecyclerView(holder.recycler)
            }
            is RSecondViewHolder -> {
               secondAdapter = SecondAdapter(context)
                val secondItem = mItems[position]
                val secondList = ArrayList<SecondList>()
                secondList.addAll(secondItem.map {
                    it as SecondList
                })
                secondAdapter.setItems(secondList)
                holder.recycler2.adapter = secondAdapter
                holder.recycler2.layoutManager = LinearLayoutManager(context).apply { orientation = LinearLayoutManager.HORIZONTAL }
                val snapHelper = CustomLinearSnapHelper()
                snapHelper.attachToRecyclerView(holder.recycler2)
            }
            is RThirdViewHolder -> {
               thirdAdapter = ThirdAdapter(context)
                val thirdItem = mItems[position]
                val thirdList = ArrayList<ThirdList>()
                thirdList.addAll(thirdItem.map {
                    it as ThirdList
                })
               thirdAdapter.setItems(thirdList)
                holder.recycler3.adapter = thirdAdapter
                holder.recycler3.layoutManager = LinearLayoutManager(context).apply { orientation = LinearLayoutManager.HORIZONTAL }
                val snapHelper = CustomLinearSnapHelper()
                snapHelper.attachToRecyclerView(holder.recycler3)
            }
            else -> {
                print("nothing!")
            }
        }

    }

    inner class RFirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner)
    }

    inner class RSecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler2: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner2)
    }

    inner class RThirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler3: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner3)
    }



}
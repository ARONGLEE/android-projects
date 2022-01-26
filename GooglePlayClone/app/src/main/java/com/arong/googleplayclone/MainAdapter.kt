package com.arong.googleplayclone

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.first.FirstAdapter
import com.arong.googleplayclone.first.List
import com.arong.googleplayclone.second.SecondAdapter
import com.arong.googleplayclone.second.SecondList
import com.arong.googleplayclone.third.ThirdActivity
import com.arong.googleplayclone.third.ThirdAdapter
import com.arong.googleplayclone.third.ThirdList

class MainAdapter(private val context: Context)  : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var items = ArrayList<ArrayList<MainList>>()
    val FIRST = 0
    val SECOND = 1
    val THIRD = 2
    val NON = 4

    override fun getItemViewType(position: Int): Int =
        when (items[position][0]) {
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

    override fun getItemCount() = items.size

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
                holder.recycler
                //holder.firstView()
            }
        }

    }

    inner class RFirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner)

        fun firstView() {
            recycler.adapter =
        }
    }

    inner class RSecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler2: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner2)
    }

    inner class RThirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recycler3: RecyclerView = itemView.findViewById<RecyclerView>(R.id.banner3)
    }



}
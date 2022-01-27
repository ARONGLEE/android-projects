package com.arong.googleplayclone.first

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.MainList
import com.arong.googleplayclone.R


class FirstAdapter(private val context: Context) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {
        lateinit var mItems:ArrayList<List>

    fun setItems(items: ArrayList<List>) {
        mItems = items
    }

    override fun getItemCount() = mItems.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_first_recycler, parent, false)

        return FirstViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        val item = mItems[position]
        holder.setItem(item)
    }

    inner class FirstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val background: View = itemView.findViewById<View>(R.id.iv_background)

        fun setItem(item: List){
            if (Build.VERSION_CODES.JELLY_BEAN > Build.VERSION.SDK_INT) {
                background.setBackgroundDrawable(ContextCompat.getDrawable(context,
                    item.imageUrl
                ))
            } else {
                background.setBackground(ContextCompat.getDrawable(context,
                    item.imageUrl
                ))
            }
        }
    }

}
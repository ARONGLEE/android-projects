package com.arong.googleplayclone.second

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.R

class SecondAdapter(private val context: Context) : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    lateinit var mItems: ArrayList<SecondList>

    open fun setItems(items : ArrayList<SecondList>) {
        mItems = items
    }

    override fun getItemCount() = mItems.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondAdapter.SecondViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_second_recycler, parent, false)

        return SecondViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        val item = mItems[position]
        holder.setItem(item)
    }

    inner class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val background: View = itemView.findViewById(R.id.iv_background2)
        val name: TextView = itemView.findViewById(R.id.name)
        val star: TextView = itemView.findViewById(R.id.star)

        fun setItem(item: SecondList){
            if(Build.VERSION_CODES.JELLY_BEAN > Build.VERSION.SDK_INT) {
                background.setBackgroundDrawable(ContextCompat.getDrawable(context, item.imageUrl))
            } else {
                background.setBackground(ContextCompat.getDrawable(context, item.imageUrl))
            }
            name.text = item.name
            star.text = item.star
        }

    }

}
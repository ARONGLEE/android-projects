package com.arong.googleplayclone.third

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.arong.googleplayclone.R

class ThirdAdapter(private val context: Context) : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {
    lateinit var mItems: ArrayList<ThirdList>

    fun setItems(items: ArrayList<ThirdList>){
        mItems = items
    }

    override fun getItemCount() = mItems.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ThirdAdapter.ThirdViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.view_third_recycler, parent, false)

        return ThirdViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ThirdAdapter.ThirdViewHolder, position: Int) {
        val item = mItems[position]
        holder.setItem(item)
    }

    inner class ThirdViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val background: View = itemView.findViewById(R.id.iv_background3)
        val icon: View = itemView.findViewById(R.id.iv_background4)
        val name: TextView = itemView.findViewById(R.id.name)
        val kind: TextView = itemView.findViewById(R.id.kind)
        val star: TextView = itemView.findViewById(R.id.star)

        fun setItem(item: ThirdList){
            if(Build.VERSION_CODES.JELLY_BEAN > Build.VERSION.SDK_INT) {
                background.setBackgroundDrawable(ContextCompat.getDrawable(context, item.imageUrl))
            } else {
                background.setBackground(ContextCompat.getDrawable(context, item.imageUrl))
            }
            if(Build.VERSION_CODES.JELLY_BEAN > Build.VERSION.SDK_INT) {
                icon.setBackgroundDrawable(ContextCompat.getDrawable(context, item.imageUrl))
            } else {
                icon.setBackground(ContextCompat.getDrawable(context, item.imageUrl))
            }
            name.text = item.name
            kind.text = item.kind
            star.text = item.star
        }




    }


}
package com.tistory.ykyh.kotlinsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var items: MutableList<MainData> = mutableListOf(
            MainData("김진규", "40"),
            MainData("박주영", "40"),
            MainData("장성훈", "39"),
            MainData("신정섭", "39"),
            MainData("이현정", "39"),
            MainData("한초롱", "38"),
            MainData("이호정", "27"),
            MainData("변지수", "27"),
            MainData("허재은", "27"),
            MainData("정승환", "23")

    )

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)


    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holer: MainViewHolder, position: Int) {
        items[position].let { item ->
            with(holer) {
                tvTitle.text = item.title
                tvContent.text = item.content
            }
        }
    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)) {
        val tvTitle = itemView.tv_main_title
        val tvContent = itemView.tv_main_content
    }
}
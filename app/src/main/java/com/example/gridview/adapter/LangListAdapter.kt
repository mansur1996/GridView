package com.example.gridview.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gridview.R
import com.example.gridview.activity.MainActivity
import com.example.gridview.model.Language

data class LangListAdapter(var languageList : List<Language>, var context: Context) :
    BaseAdapter() {

    override fun getCount() = languageList.size

    override fun getItem(position: Int): Any {
        return languageList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View = View.inflate(context, R.layout.layout_adapter, null)

        val tv_num = view.findViewById<TextView>(R.id.tv_number)
        val tv_lang = view.findViewById<TextView>(R.id.tv_lang)
        val im_lang = view.findViewById<ImageView>(R.id.im_lang)

        tv_num.text = (position + 1).toString() + "."
        tv_lang.text = languageList.get(position).name
        im_lang.setImageResource(languageList.get(position).img_icon)

        return view
    }
}
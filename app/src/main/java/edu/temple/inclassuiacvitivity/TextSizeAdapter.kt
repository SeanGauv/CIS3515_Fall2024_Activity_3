package edu.temple.inclassuiacvitivity

import android.content.Context
import android.graphics.Color
import android.util.Size
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val numbers: Array<Int>) : BaseAdapter() {

    override fun getCount() = numbers.size

    override fun getItem(position: Int) = numbers[position]

    override fun getItemId(position: Int) = numbers[position].toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if (convertView != null) {
            textView = convertView as TextView
        } else {
            textView = TextView(context)
            textView.textSize = 22f
            textView.setPadding(5, 10, 0, 10)
        }

        return textView
    }

}
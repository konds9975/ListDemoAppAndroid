package com.example.kondya.listdemoapp

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)
        //listView.setBackgroundColor(Color.parseColor("#FF0000"))
        listView.adapter = MyCustomAdpter(this)

    }

    private class MyCustomAdpter(context: Context): BaseAdapter() {

        private val mContext: Context

        private  val nameArray = arrayListOf<String>(

                "Ajinkaya","Sagar","Hiten","Kondiram","Sonali","Kiran","Yogesh","Shushant","Ashwini","Suraj","Ajinkaya","Sagar","Hiten","Kondiram","Sonali","Kiran","Yogesh","Shushant","Ashwini","Suraj"
        ,"Ajinkaya","Sagar","Hiten","Kondiram","Sonali","Kiran","Yogesh","Shushant","Ashwini","Suraj","Ajinkaya","Sagar","Hiten","Kondiram","Sonali","Kiran","Yogesh","Shushant","Ashwini","Suraj"
        )

        init {
            mContext = context
        }

        override fun getCount(): Int {
            return  nameArray.size
        }
        override fun getItemId(position: Int): Long {
            return  position.toLong()
        }

        override fun getItem(position: Int): Any {

            return  "test string"

        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main,parent,false)

            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
            positionTextView.text = "Row number: $position"

            val nameTextView = rowMain.findViewById<TextView>(R.id.name_textview)

            nameTextView.text = "Name: ${nameArray[position]}"


            return rowMain

//            val textView = TextView(mContext)
//            textView.text = "This is my Row for my ListView"
//            return textView

        }

    }

}

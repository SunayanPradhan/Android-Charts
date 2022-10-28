package com.sunayanpradhan.androidcharts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class BarChartActivity : AppCompatActivity() {

    lateinit var barChart:BarChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)


        barChart=findViewById(R.id.bar_chart)


        val list: ArrayList<BarEntry> = ArrayList()

        list.add(BarEntry(100f,100f))
        list.add(BarEntry(101f,200f))
        list.add(BarEntry(102f,300f))
        list.add(BarEntry(103f,400f))
        list.add(BarEntry(104f,500f))


        val barDataSet= BarDataSet(list,"List")

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS,255)
        barDataSet.valueTextColor=Color.BLACK

        val barData= BarData(barDataSet)

        barChart.setFitBars(true)

        barChart.data= barData

        barChart.description.text= "Bar Chart"

        barChart.animateY(2000)







    }
}
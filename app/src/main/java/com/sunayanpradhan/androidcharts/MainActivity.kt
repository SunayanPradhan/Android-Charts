package com.sunayanpradhan.androidcharts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var goBarChart:Button

    lateinit var goPieChart:Button

    lateinit var goRadarChart:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goBarChart=findViewById(R.id.go_bar_chart)

        goPieChart=findViewById(R.id.go_pie_chart)

        goRadarChart=findViewById(R.id.go_radar_chart)

        goBarChart.setOnClickListener {

            startActivity(Intent(this,BarChartActivity::class.java))

        }

        goPieChart.setOnClickListener {

            startActivity(Intent(this,PieChartActivity::class.java))

        }

        goRadarChart.setOnClickListener {

            startActivity(Intent(this,RadarChartActivity::class.java))

        }


    }
}
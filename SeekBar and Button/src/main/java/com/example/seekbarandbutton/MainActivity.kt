package com.example.seekbarandbutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var alpha = 0
    var red = 0
    var green = 0
    var blue = 0
    var myColor = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Alpha.max = 255
        Red.max = 255
        Green.max = 255
        Blue.max = 255
    }
    fun changeColor(v: View){
        class CommonListener: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id) {
                    R.id.Alpha -> alpha = p1
                    R.id.Red -> red = p1
                    R.id.Green -> green = p1
                    R.id.Blue -> blue = p1
                }
                myColor = Color.argb(alpha,red,green,blue)
                when(v.id){
                    R.id.button -> button.setBackgroundColor(myColor)
                    R.id.button2 -> button2.setBackgroundColor(myColor)
                    R.id.button3 -> button3.setBackgroundColor(myColor)
                    R.id.button4 -> button4.setBackgroundColor(myColor)
                    R.id.button5 -> button5.setBackgroundColor(myColor)
                    R.id.button6 -> button6.setBackgroundColor(myColor)
                }
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }
        var common = CommonListener()
        Alpha.setOnSeekBarChangeListener(common)
        Red.setOnSeekBarChangeListener(common)
        Green.setOnSeekBarChangeListener(common)
        Blue.setOnSeekBarChangeListener(common)
    }
}
package com.example.seekbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val textView = findViewById<TextView>(R.id.tvText)

        textView.setText("Volume: " +seekBar.progress+"/" +seekBar.max)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (seekBar != null) {
                    textView.setText("Volume: " +progress+"/" +seekBar.max)
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                showToast("onStart")
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                showToast("OnStop")
            }
        })


    }

}



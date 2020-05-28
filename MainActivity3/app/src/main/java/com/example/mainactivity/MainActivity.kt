package com.example.mainactivity

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.graphics.toColorInt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preference = PreferencesManager(this)
        var counter = preference.getCounter()
        var color = preference.getColor()
        val redButton = findViewById<Button>(R.id.redButton)
        preference.setCounter(counter)
        preference.setColor(color)
        counterTextView.text = counter.toString()
        counterTextView.setBackgroundColor(color)
        redButton.setOnClickListener {
            counter++
            color = Color.RED
            preference.setColor(color)
            preference.setCounter(counter)
            counterTextView.text = counter.toString()
            counterTextView.setBackgroundColor(color)
        }
        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener{
            counter=0
            color = Color.DKGRAY
            preference.setCounter(counter)
            preference.setColor(color)
            counterTextView.text = counter.toString()
            counterTextView.setBackgroundColor(color)
        }
        blackButton.setOnClickListener {
            counter++
            color = Color.BLACK
            preference.setColor(color)
            preference.setCounter(counter)
            counterTextView.text = counter.toString()
            counterTextView.setBackgroundColor(color)
        }
        blueButton.setOnClickListener {
            counter++
            color = Color.BLUE
            preference.setColor(color)
            preference.setCounter(counter)
            counterTextView.text = counter.toString()
            counterTextView.setBackgroundColor(color)
        }
        greenButton.setOnClickListener {
            counter++
            color = Color.GREEN
            preference.setColor(color)
            preference.setCounter(counter)
            counterTextView.text = counter.toString()
            counterTextView.setBackgroundColor(color)
        }
    }
}

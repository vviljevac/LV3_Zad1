package com.example.mainactivity

import android.content.Context
import android.graphics.Color

class PreferencesManager(context: Context) {
    val PREFERENCE_NAME = "PreferenceName"
    val PREFERENCE_COUNTER = "Counter"
    val PREFERENCE_COLOR = "Color"


    val preference = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getCounter() : Int{
        return preference.getInt(PREFERENCE_COUNTER, 0)
    }
    fun setCounter(count:Int){
        val editor = preference.edit()
        editor.putInt(PREFERENCE_COUNTER, count)
        editor.apply()
    }
    fun getColor(): Int{
        return preference.getInt(PREFERENCE_COLOR,0)
    }
    fun setColor(color: Int){
        val colorEditor = preference.edit()
        colorEditor.putInt(PREFERENCE_COLOR, color)
        colorEditor.apply()
    }
}
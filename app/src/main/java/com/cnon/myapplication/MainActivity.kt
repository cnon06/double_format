package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fr  = 13.56657677677
        println(fr)
        println(fr.formatla(3))



    }


    fun Double.formatla(Sayi: Int) = java.lang.String.format("%.${Sayi}f",this)
}
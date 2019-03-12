package com.niam.tugasjodoh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {jodohkuy()}

    }

    fun jodohkuy(){
        val randomDora = Random().nextInt(5)+1
        val randomemon = Random().nextInt(4)+1
        val drawableResDora = when (randomDora){
            1 ->R.drawable.putra1
            2 ->R.drawable.putra2
            3 ->R.drawable.putra4
            4 ->R.drawable.putra5
            else -> R.drawable.putra6
        }

        val drawableResemon = when (randomemon){
            1 ->R.drawable.putri6
            2 ->R.drawable.putri2
            3 ->R.drawable.putri3
            else -> R.drawable.putri4

        }

        dora1.setImageResource(drawableResDora)
        dora2.setImageResource(drawableResemon)
    }

}

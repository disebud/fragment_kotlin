package com.example.exercise_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter_show.*

class MainActivity : AppCompatActivity() {

    lateinit var counterFragment:CounterFragment
    lateinit var counterShowFragment: CounterShowFragment

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment as CounterFragment
        counterShowFragment = fragment2 as CounterShowFragment
        println("MAIN _ACTIVITY this = $this")

        //versi 1
//        value.setText("" + counter)
//
//        plusButton.setOnClickListener {
//            value.setText("" + ++counter)
//        }
//
//        minusButton.setOnClickListener {
//            value.setText("" + --counter)
//        }
    }


    fun notifyCounterIncrease() {
        counter+=1
        counterShowFragment.notifyCounterChange(counter)
    }
    fun notifyCounterDecrease() {
        counter-=1
        counterShowFragment.notifyCounterChange(counter)
    }

//    fun sendData(passData: String) {
//    value.text = passData
//    }
}

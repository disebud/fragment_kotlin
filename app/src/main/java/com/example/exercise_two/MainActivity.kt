package com.example.exercise_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter_show.*

class MainActivity : AppCompatActivity() {

//    lateinit var counterFragment:CounterFragment
//    lateinit var counterShowFragment: CounterShowFragment

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        counterFragment = fragment as CounterFragment
//        counterShowFragment = fragment2 as CounterShowFragment

        value.setText("" + counter)

        plusButton.setOnClickListener {
            value.setText("" + ++counter)
        }

        minusButton.setOnClickListener {
            value.setText("" + --counter)
        }
    }


//    fun increase(view: View) {}
//    fun decrease(view: View) {}
}
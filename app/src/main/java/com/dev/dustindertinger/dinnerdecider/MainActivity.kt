package com.dev.dustindertinger.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Bakso", "Makanan Padang", "Mie Goreng", "Nasi Goreng")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     decideButton.setOnClickListener {
         val random = Random()
         val randomFood = random.nextInt(foodList.count())
         selectedFoodText.text = foodList[randomFood]
     }

        addFoodButton.setOnClickListener{
            val newFood = addFoodText.text.toString()
            if (newFood != null && newFood.length > 0){
                foodList.add(newFood)
                addFoodText.text.clear()
                println(foodList)
            }
        }

    }
}

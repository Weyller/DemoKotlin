package ca.qc.lbpsb.fusion.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDos","Bel Pro")
    var addedFood = ""
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Menu Resto"

        addedFood = editFood.text.toString()

       btnAdd.setOnClickListener {

           foodList.add(editFood.text.toString())
           addedFood.c
           editFood.hint = "add new food here..."
           Toast.makeText(this,"Food Added", Toast.LENGTH_SHORT).show()

       }


        btnDecide.setOnClickListener {

            val random = Random()
            val randomFood = random.nextInt(foodList.size)
            selectFood.text = foodList[randomFood]
            //Toast.makeText(this,"Decide Button", Toast.LENGTH_SHORT).show()
        }
    }


}



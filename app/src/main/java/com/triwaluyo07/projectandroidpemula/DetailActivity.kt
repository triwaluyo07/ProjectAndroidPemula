package com.triwaluyo07.projectandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    lateinit var namaFood: TextView
    lateinit var asalFood: TextView
    lateinit var detailFood: TextView
    lateinit var gambarFood: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        namaFood = findViewById(R.id.txtNamaFood)
        asalFood = findViewById(R.id.txtNamaSub)
        detailFood = findViewById(R.id.txtFoodDetail)
        gambarFood = findViewById(R.id.imageView)



        val potoFood: Int = intent.getIntExtra("IMAGE",0)
        val nama: String? = intent.getStringExtra("NAMA")
        val subFood: String? = intent.getStringExtra("SUBTITLE")
        val dtlFood: String? = intent.getStringExtra("DETAIL")


        gambarFood.setImageResource(potoFood)
        namaFood.setText(nama)
        asalFood.setText(subFood)
        detailFood.setText(dtlFood)

//        if(intent.extras != null)
//        {
//            val mydata = intent.extras!!.getStringArray("MYDATA")
//            namaFood?.text = mydata?.get(0)
//            asalFood?.text = mydata?.get(1)
//            detailFood?.text = mydata?.get(2)
//            gambarFood?.setImageResource(resources.getIdentifier(mydata?.get(3),"drawable",packageName))
//        }
    }
}
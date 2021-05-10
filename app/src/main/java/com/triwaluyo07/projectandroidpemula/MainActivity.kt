package com.triwaluyo07.projectandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvFoods: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private var title: String = "Makanan Khas Indonesia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvFoods = findViewById(R.id.rv_food)
        rvFoods.setHasFixedSize(true)

        list.addAll(FoodData.listFood)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvFoods.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(this@MainActivity,list)
        rvFoods.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Food){
                showSelectedFood(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){

        when(selectedMode) {
            R.id.action_list -> {
                title = "Makanan Khas Indonesia"
                showRecyclerList()

            }

            R.id.action_about -> {
                title = "About"
                startActivity(Intent(this@MainActivity, About::class.java))

            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedFood(food: Food){
        Toast.makeText(this,"Kamu Memilih " + food.name, Toast.LENGTH_SHORT).show()
    }

}
package com.example.mysubmission

import Food
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var foodies: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profil_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_profile -> {
                val moveData = Intent(this@MainActivity, ProfileActivity::class.java)
                moveData.putExtra(ProfileActivity.EXTRA_NAMA, "Bernanda Fredya Putri")
                moveData.putExtra(ProfileActivity.EXTRA_EMAIL, "haihaiputri@gmail.com")
                moveData.putExtra("profilId", R.drawable.profil)
                startActivity(moveData)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        foodies = findViewById(R.id.food_list)
        foodies.setHasFixedSize(true)

        list.addAll(FoodData.listMakanan)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        foodies.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = FoodAdapter(list)
        foodies.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : FoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedMenu(data)
            }
        })
    }

    private fun showSelectedMenu(food: Food) {
        val i = Intent(this@MainActivity, DetailRecipe::class.java)
        i.putExtra(DetailRecipe.EXTRA_NAME, food.name)
        i.putExtra(DetailRecipe.EXTRA_DETAIL, food.detail)
        i.putExtra(DetailRecipe.EXTRA_MATERIAL, food.material)
        i.putExtra(DetailRecipe.EXTRA_TUTORIAL, food.tutorial)
        i.putExtra("resId", food.pic)
        startActivity(i)
    }

}
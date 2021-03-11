package com.example.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailRecipe : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "Nama Makanan"
        const val EXTRA_DETAIL = "Detail Makanan"
        const val EXTRA_MATERIAL = "Detail Material"
        const val EXTRA_TUTORIAL = "Detail Tutorial"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recipe)

        val img_chosen: ImageView = findViewById(R.id.item_photo_detail)
        val nama_chosen: TextView = findViewById(R.id.nama_makanan)
        val detail_chosen: TextView = findViewById(R.id.desc)
        val bahan_chosen: TextView = findViewById(R.id.bahan_makanan)
        val tutorial_chosen: TextView = findViewById(R.id.cara_buat)

        val nama = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val material = intent.getStringExtra(EXTRA_MATERIAL)
        val tutorial = intent.getStringExtra(EXTRA_TUTORIAL)
        val resId: Int = intent.extras!!.getInt("resId")

        nama_chosen.text = "$nama"
        detail_chosen.text = "$detail"
        bahan_chosen.text= "$material"
        tutorial_chosen.text = "$tutorial"
        img_chosen.setImageResource(resId)

        val actionBar = supportActionBar
        actionBar!!.title = "$nama"
        
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
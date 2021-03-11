package com.example.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "Nama Pengguna"
        const val EXTRA_EMAIL = "Email Pengguna"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val nama: TextView = findViewById(R.id.user_name)
        val email: TextView = findViewById(R.id.email)
        val profil: ImageView = findViewById(R.id.profile)

        val nama_user = intent.getStringExtra(EXTRA_NAMA)
        val email_user = intent.getStringExtra(EXTRA_EMAIL)
        val profilId: Int = intent.extras!!.getInt("profilId")

        nama.text = "$nama_user"
        email.text = "$email_user"
        profil.setImageResource(profilId)

        val actionBar = supportActionBar
        actionBar!!.title = "Profile"

        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
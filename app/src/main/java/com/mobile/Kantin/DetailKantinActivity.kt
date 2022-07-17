package com.mobile.Kantin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKantinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kantin)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val superHero = intent.getParcelableExtra<Kantin>(MainActivity.INTENT_PARCELABLE)

        val imageKantin = findViewById<ImageView>(R.id.img_item_photo)
        val nameKantin = findViewById<TextView>(R.id.tv_item_name)
        val descKantin = findViewById<TextView>(R.id.tv_item_description)

        imageKantin.setImageResource(superHero?.imageKantin!!)
        nameKantin.text = superHero.nameKantin
        descKantin.text = superHero.descKantin

    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}
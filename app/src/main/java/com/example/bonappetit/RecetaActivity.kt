package com.example.bonappetit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecetaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar
        setContentView(R.layout.activity_receta)
        val ingre = findViewById<Button>(R.id.ingredientes)
        ingre.setOnClickListener(){
            IrIngrediente()
        }
    }

    private fun IrIngrediente() {
        val i = Intent(this, IngredienteActivity::class.java)
        startActivity(i)
    }
}
package com.example.bonappetit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IngredienteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar
        setContentView(R.layout.activity_ingrediente)
    }
}
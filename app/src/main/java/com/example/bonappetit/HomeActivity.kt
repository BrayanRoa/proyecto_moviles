package com.example.bonappetit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()!!.hide(); // hide the title bar
        setContentView(R.layout.activity_home)

        val mas = findViewById<Button>(R.id.mas1 )
        val mas2 = findViewById<Button>(R.id.mas2 )
        val mas3 = findViewById<Button>(R.id.mas3 )
        val mas4 = findViewById<Button>(R.id.mas4 )
        mas.setOnClickListener(){
            IrReceta()
        }
        mas2.setOnClickListener(){
            IrReceta()
        }
        mas3.setOnClickListener(){
            IrReceta()
        }
        mas4.setOnClickListener(){
            IrReceta()
        }
    }

    private fun IrReceta() {
        val i = Intent(this, RecetaActivity::class.java)
        startActivity(i)
    }
}
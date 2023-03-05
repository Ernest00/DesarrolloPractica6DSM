package com.example.myapplicationpractica06_dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TableLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_layout)
    }

    fun finalizarActividad(v: View?){
        finish()
    }
}
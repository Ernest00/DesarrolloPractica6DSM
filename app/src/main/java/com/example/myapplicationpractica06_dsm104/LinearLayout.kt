package com.example.myapplicationpractica06_dsm104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
    }

    fun finalizarActividad(v: View?){
        finish()
    }
}
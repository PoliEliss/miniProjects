package com.rorono.a0603thefirstproject.ProjectOneCounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rorono.a0603thefirstproject.R

class Calculate: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

    }

    fun getNumber(view:View){
        Toast.makeText(this,"Buttom clicked", Toast.LENGTH_LONG).show()

    }
}
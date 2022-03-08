package com.rorono.a0603thefirstproject.ProjectOneCounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rorono.a0603thefirstproject.R
import net.objecthunter.exp4j.ExpressionBuilder

class Calculate : AppCompatActivity() {
    var tvInput: TextView? = null

    var lastNumeric: Boolean = false

    var lastDot: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        tvInput = findViewById(R.id.fild)
    }

    fun getNumber(view: View) {
        //Toast.makeText(this, "Buttom clicked", Toast.LENGTH_LONG).show()

        tvInput?.append((view as Button).text)

        lastNumeric = true
        lastDot = false

    }


    fun ocClear(view: View) {
        tvInput?.text = ""
    }

    fun delereElementEnd(view: View) {
        tvInput?.text = tvInput?.text!!.substring(0, tvInput?.length()!! - 1)
    }

    fun onDecimalPoint(view: View) {
        if (lastNumeric && !lastDot) {
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }





   /* fun isAdd(value: String): Boolean {
        return if (value.startsWith("-")){
            false
        } else {
            value.contains("/")||value.contains("+") || value.contains("*")||value.contains("-")
        }
    }*/

    fun getResult(view: android.view.View) {

        val ex = ExpressionBuilder(tvInput?.text.toString()).build()
        val result =  ex.evaluate()

        var longRes = result.toLong()

        if (result == longRes.toDouble()){
            tvInput?.text = longRes.toString()
        } else{
            tvInput?.text = result.toString()
        }




    }
}
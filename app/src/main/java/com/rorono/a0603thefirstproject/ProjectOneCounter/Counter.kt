package com.rorono.a0603thefirstproject.ProjectOneCounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.rorono.a0603thefirstproject.R


class Counter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button: Button = findViewById(R.id.button_ttt)

        val text: TextView = findViewById(R.id.hello_text)

        val buttonMinus: Button = findViewById(R.id.button_minus)

        val allCount: TextView = findViewById(R.id.all_count)
        var counter = 0
        var plus = 0








        button.setOnClickListener {
            Toast.makeText(this@Counter, "You clicked me", Toast.LENGTH_LONG).show()
            plus += 1 // это сокращенная запись timeClicked =timeClicked + 1
            text.text = plus.toString() // таким образом получаем счетчик
             counter+=1

            allCount.text = counter.toString()

            /*if (text.text == "Hello Name!") {
                text.text = "Пока!"
            } else {
                text.text = "Hello Name!"
            }*/


        }

        buttonMinus.setOnClickListener {

            plus -= 1
            text.text = plus.toString()
            counter+=1
            allCount.text = counter.toString()
        }

    }

}

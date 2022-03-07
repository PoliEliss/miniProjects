package com.rorono.a0603thefirstproject.ProjectOneCounter

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rorono.a0603thefirstproject.R
import java.text.SimpleDateFormat
import java.util.*

class Primer2 : AppCompatActivity() {

    var tvSelectedDate: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        tvSelectedDate = findViewById(R.id.tv_selected_date)


        val button: Button = findViewById(R.id.button_date)



        button.setOnClickListener { view ->
            clickDatePicker(view)
            //Toast.makeText(this, "Button works", Toast.LENGTH_LONG).show()
        }
    }

    fun clickDatePicker(view: View) {

        val myCalendar = Calendar.getInstance()

        val year = myCalendar.get(Calendar.YEAR)

        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)




     val dpd =   DatePickerDialog(this, DatePickerDialog.OnDateSetListener
        { view, selectedYear, selectedMonth, selectedDayOfMonth ->
            Toast.makeText(
                this,
                "The chosen year is $selectedYear, the month is $selectedMonth and the day is $selectedDayOfMonth  ",
                Toast.LENGTH_LONG
            ).show()

            val selectedDate = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"

            tvSelectedDate?.text = selectedDate

            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

            val theDate = sdf.parse(selectedDate)

            val selectedDateInMinutes = theDate.time / 60000 //количество минут = количество миллисекунд/60000



            val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
           // var currentDate = Date() //текущее время?

            // форматирование времени как день месяц  год

            val currentDateInMinutes = currentDate.time/60000

            var dateFormat = SimpleDateFormat("dd/MM.yyy", Locale.ENGLISH)

            var differenceInMinute = currentDateInMinutes - selectedDateInMinutes

            // записываем в переменную выбранное время на календаре

            //  var dateShoes = dateFormat.parse(selectedDate)




           //  var milliseconds = currentDate.time - theDate.time

            var dateText: String = dateFormat.format(currentDate) //в стринг


            //


            var ageInMinute: TextView = findViewById(R.id.age_in_minute)
            ageInMinute.setText(differenceInMinute.toString())


        }, year,
            month,
            day)
        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
         dpd.show()

    }
}
package jp.techacademy.moe.hatori.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()
        }

    }




    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { hour ->
                if(2 <= hour $$ hour <= 9){
                    TextView.text = "おはよう"
                } else if (10 <= hour $$ hour <= 17){
                    TextView.text = "こんにちは"
                }else {
                    TextView.text = "こんばんわ"
                }
            },
            13, 0, true)
        timePickerDialog.show()



    }



}

//if(2 <= hourOfDay $$ hourOfDay <= 9){
//    TextView.text = "おはよう"
//} else if (10 <= hourOfDay $$ hourOfDay <= 17){
//    TextView.text = "こんにちは"
//}else {
//    TextView.text = "こんばんわ"
//}
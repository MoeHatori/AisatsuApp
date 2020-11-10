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
        val result:String
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if(2 <= hour && hour <= 9){
                    Log.d("UI_PARTS","おはよう")
                    textView.text = "おはよう"
                } else if (10 <= hour && hour <= 17){
                    Log.d("UI_PARTS","こんにちわ")
                    textView.text = "こんにちは"
                }else {
                    Log.d("UI_PARTS","こんばんわ")
                    textView.text = "こんばんわ"
                }
            },
            13, 0, true)
        timePickerDialog.show()

    }



}


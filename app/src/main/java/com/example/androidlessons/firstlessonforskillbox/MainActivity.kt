package com.example.androidlessons.firstlessonforskillbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn1.setOnClickListener {
            Toast.makeText(this, "Кнопка 1", Toast.LENGTH_SHORT).show()
            Log.d("@btnClick","Нажата кнопка 1")
        }
        btn2.setOnClickListener {
            Toast.makeText(this, "Кнопка 2", Toast.LENGTH_SHORT).show()
            Log.d("@btnClick","Нажата кнопка 2")
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "Кнопка 3", Toast.LENGTH_SHORT).show()
            Log.d("@btnClick","Нажата кнопка 3")
        }
    }
}
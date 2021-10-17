package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView
    lateinit var edinfo:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        textView=findViewById(R.id.textView)
        edinfo=findViewById(R.id.edinfo)

        button.setOnClickListener {
            textView.text=edinfo.text
        }
    }
}
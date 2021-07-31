package com.example.testx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val name=intent.getStringExtra("username")
        val resultView:TextView=findViewById(R.id.resultView)
        resultView.text=name
    }
}
package com.example.lifecycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button
    private lateinit var textView : TextView

    private lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        setText()
        button.setOnClickListener {
            increment()
        }
    }

    fun setText(){
        textView.text = mainViewModel.count.toString()
    }

    private fun increment() {
        mainViewModel.increment()
        setText()
    }
}
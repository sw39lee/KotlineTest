package com.example.always2390.kotlintest

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class KotlinTestMainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_test_main)

        findViewById<TextView>(R.id.main_text).setText("Text")
        val bt = findViewById<Button>(R.id.main_button) as Button
        bt.setText("Button")
        bt.setOnClickListener {
            startActivity(Intent(this, NormalJavaActivity::class.java))
        }

    }

}

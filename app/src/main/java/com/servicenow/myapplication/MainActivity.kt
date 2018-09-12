package com.servicenow.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java)
            intent.putExtra("1", editText1.text.toString())
            intent.putExtra("2", editText2.text.toString())
            startActivity(intent)
        }
    }
}

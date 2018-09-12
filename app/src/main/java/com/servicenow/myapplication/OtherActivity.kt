package com.servicenow.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val text1 = intent.extras.getString("1")
        val text2 = intent.extras.getString("2")

        textView1.text = text1
        textView2.text = text2
    }
}

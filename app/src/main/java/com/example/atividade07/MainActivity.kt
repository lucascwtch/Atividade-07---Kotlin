package com.example.atividade07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button1: Button = findViewById(R.id.btVar1)
    val button2: Button = findViewById(R.id.btVar2)
    val relativeLayout: RelativeLayout = findViewById(R.id.rlVar1)

    button1.setOnClickListener {
        relativeLayout.setBackgroundResource(R.color.cool)
    }

    button2.setOnClickListener {
        relativeLayout.setBackgroundResource(R.color.warm)
    }
}
}



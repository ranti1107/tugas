package com.supiarti.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val j_pengikut = findViewById<TextView>(R.id.j_pengikut)
        val tmbl_follow = findViewById<Button>(R.id.tmbl_follow)
        var pengikut = 1

        j_pengikut.text = pengikut.toString()
        tmbl_follow.setOnClickListener {
            pengikut++
            j_pengikut.text = pengikut.toString()
        }
    }
}
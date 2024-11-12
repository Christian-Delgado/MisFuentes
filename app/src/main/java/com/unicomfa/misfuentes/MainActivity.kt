package com.unicomfa.misfuentes

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val tvAnton = findViewById<TextView>(R.id.tiny)
        val tvDancing = findViewById<TextView>(R.id.danfo)
        tvAnton.typeface = ResourcesCompat.getFont(this, R.font.tiny5_normal)
        tvDancing.typeface = ResourcesCompat.getFont(this, R.font.danfo_normal)
    }
}
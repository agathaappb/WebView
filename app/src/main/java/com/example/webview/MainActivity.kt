package com.example.webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnAcessWebView : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setView()
        btnAcessWebView.setOnClickListener {
            startActivity(Intent(this, webView::class.java))
        }
    }

    private fun setView(){
        btnAcessWebView = findViewById(R.id.btn_webview)
    }
}
package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebView

class webView : AppCompatActivity() {
    companion object{
        const val URL = "https://www.android.com/intl/pt-BR_br/"
    }

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        setView()
        initWebView()
    }

    private fun setView(){
        webView = findViewById(R.id.webViewActivity)
    }

    private fun initWebView(){
        //Mantendo o usuário na mesma tela do webview
        webView = WebView(applicationContext)
        setContentView(webView)
        //Carregando a página web
        webView.loadUrl(URL)
    }

}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getWebView())
    }

    private fun getWebView(): WebView {
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.twitter.com")
        return webView
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class hungama extends AppCompatActivity {
WebView webView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hungama);
        webView6=findViewById(R.id.adv6);
        webView6.getSettings().setJavaScriptEnabled(true);
        webView6.setWebViewClient(new WebViewClient());
        webView6.loadUrl("https://www.hungama.com/");

        webView6.getSettings().setSupportZoom(true);
        webView6.getSettings().setBuiltInZoomControls(true);
    }
    @Override
    public void onBackPressed() {
        if (webView6.canGoBack()) {
            webView6.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class spotify extends AppCompatActivity {
WebView webView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);
        webView4=findViewById(R.id.adv3);
        webView4.getSettings().setJavaScriptEnabled(true);
        webView4.setWebViewClient(new WebViewClient());
        webView4.loadUrl("https://www.spotify.com/");

        webView4.getSettings().setSupportZoom(true);
        webView4.getSettings().setBuiltInZoomControls(true);
    }
    @Override
    public void onBackPressed() {
        if (webView4.canGoBack()) {
            webView4.goBack();
        } else {
            super.onBackPressed();
        }
    }

}


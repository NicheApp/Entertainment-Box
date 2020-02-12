package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bigo extends AppCompatActivity {
WebView webView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigo);

        webView3=findViewById(R.id.adv2);
        webView3.getSettings().setJavaScriptEnabled(true);
        webView3.setWebViewClient(new WebViewClient());
        webView3.loadUrl("http://www.bigo.tv/");

        webView3.getSettings().setSupportZoom(true);
        webView3.getSettings().setBuiltInZoomControls(true);

    }
    @Override
    public void onBackPressed() {
        if (webView3.canGoBack()) {
            webView3.goBack();
        } else {
            super.onBackPressed();
        }
    }

}



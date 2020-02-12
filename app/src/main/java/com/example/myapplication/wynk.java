package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wynk extends AppCompatActivity {
WebView webView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wynk);
        webView8=findViewById(R.id.adv7);
        webView8.getSettings().setJavaScriptEnabled(true);
        webView8.setWebViewClient(new WebViewClient());
        webView8.loadUrl("https://wynk.in/music");

        webView8.getSettings().setSupportZoom(true);
        webView8.getSettings().setBuiltInZoomControls(true);
    }
    @Override
    public void onBackPressed() {
        if (webView8.canGoBack()) {
            webView8.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

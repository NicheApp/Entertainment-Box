package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class saavn extends AppCompatActivity {
WebView webView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saavn);
        webView5=findViewById(R.id.adv5);
        webView5.getSettings().setJavaScriptEnabled(true);
        webView5.setWebViewClient(new WebViewClient());
        webView5.loadUrl("https://www.jiosaavn.com/");

        webView5.getSettings().setSupportZoom(true);
        webView5.getSettings().setBuiltInZoomControls(true);
    }
    @Override
    public void onBackPressed() {
        if (webView5.canGoBack()) {
            webView5.goBack();
        } else {
            super.onBackPressed();
        }
    }

}

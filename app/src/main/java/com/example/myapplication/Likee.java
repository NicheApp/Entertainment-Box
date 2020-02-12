package com.example.myapplication;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Likee extends AppCompatActivity {
    WebView webView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.likee);
        webView2=findViewById(R.id.adv1);
        webView2.getSettings().setJavaScriptEnabled(true);

        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://likee.com/");
        webView2.getSettings().setSupportZoom(true);
        webView2.getSettings().setBuiltInZoomControls(true);

    }
    public void onBackPressed() {
        if (webView2.canGoBack()) {
            webView2.goBack();
        } else {
            super.onBackPressed();
        }
    }

}


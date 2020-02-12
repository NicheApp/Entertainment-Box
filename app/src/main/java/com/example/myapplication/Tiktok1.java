package com.example.myapplication;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Tiktok1 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiktok);
        webView1=findViewById(R.id.adv);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("https://www.tiktok.com/trending/?lang=en");

        webView1.getSettings().setSupportZoom(true);
        webView1.getSettings().setBuiltInZoomControls(true);


}
   /* @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webView1.canGoBack()) {
                        webView1.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }*/
   @Override
   public void onBackPressed() {
       if (webView1.canGoBack()) {
           webView1.goBack();
       } else {
           super.onBackPressed();
       }
   }

}

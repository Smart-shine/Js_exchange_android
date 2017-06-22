package com.niuanqi.js_exchange_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        niuanqi;
        differ1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView2 = (WebView) findViewById(R.id.webview2);
        webView2.setWebChromeClient(new WebChromeClient() {

            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                return super.onJsAlert(view, url, message, result);
            }
        });

        webView2.loadUrl("file:///android_asset/Js_webview.html");

    }

    public void jump(View v) {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
        finish();
    }
}

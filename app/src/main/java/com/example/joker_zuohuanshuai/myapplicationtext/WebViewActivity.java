package com.example.joker_zuohuanshuai.myapplicationtext;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by joker_zuohuanshuai on 2018/8/9.
 */

public class WebViewActivity extends Activity {


    private WebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);
        webView = (WebView) findViewById(R.id.webview1);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://dev.becomebff.cn/award/index.html?id=005f3651dbd04d96be73438a60accaa7");
//        webView.loadUrl("https://www.baidu.com/");
    }
}

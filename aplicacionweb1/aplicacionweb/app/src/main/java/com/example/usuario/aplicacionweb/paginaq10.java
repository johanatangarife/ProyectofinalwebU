package com.example.usuario.aplicacionweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class paginaq10 extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaq10);

        webview = (WebView) findViewById(R.id.web2);
        webview.loadUrl("https://www.q10academico.com/login?ReturnUrl=/&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
    }
}

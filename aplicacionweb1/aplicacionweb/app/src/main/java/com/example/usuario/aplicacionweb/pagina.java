package com.example.usuario.aplicacionweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class pagina extends AppCompatActivity {

    WebView webviewm ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina);

        webviewm = (WebView) findViewById(R.id.web3);
        webviewm.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
    }
}

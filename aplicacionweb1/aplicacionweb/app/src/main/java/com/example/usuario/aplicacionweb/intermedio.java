package com.example.usuario.aplicacionweb;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.RadioGroup;

public class intermedio extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedio);


        String resultado = getIntent().getStringExtra("parametro");

        webView= (WebView)findViewById(R.id.webviewint);


                if (resultado.equals("2")){
                    webView.loadUrl("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

                }
                else if (resultado.equals("3")){
                    webView.loadUrl("http://biblioteca.uniremington.edu.co/index.php/login");

                }
                else if (resultado.equals("4")){
                    webView.loadUrl("http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html");
                }
            }

}



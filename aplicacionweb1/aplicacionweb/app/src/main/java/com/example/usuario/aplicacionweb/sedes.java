package com.example.usuario.aplicacionweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.widget.AdapterView.*;

public class sedes extends AppCompatActivity {

    Spinner spinner;
    WebView websp;
    String[] ArrayAspi = {"Seleccionar", "Oferta Academica", "Formas de Pago", "Convenios y Descuentos", "Pre-Inscripción"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);
        spinner = (Spinner) findViewById(R.id.spinner);
        websp = (WebView) findViewById(R.id.webviewsp);

        websp.loadUrl("http://www.uniremington.edu.co/manizales/");

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ArrayAspi);

        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), ArrayAspi[position], Toast.LENGTH_LONG);
                        to.show();
                        websp.loadUrl("http://www.uniremington.edu.co/buscador.html?isc=1&category_id=&xf_1=3&programa=si");
                        break;

                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(), ArrayAspi[position], Toast.LENGTH_LONG);
                        t.show();
                        websp.loadUrl("http://www.uniremington.edu.co/procesos-de-admision/facilidades-de-pago.html");
                        break;

                    case 3:
                        Toast o = Toast.makeText(getApplicationContext(), ArrayAspi[position], Toast.LENGTH_LONG);
                        o.show();
                        websp.loadUrl("http://www.uniremington.edu.co/procesos-de-admision/convenios-y-descuentos.html");
                        break;

                    case 4:
                        Toast a = Toast.makeText(getApplicationContext(), ArrayAspi[position], Toast.LENGTH_LONG);
                        a.show();
                        websp.loadUrl("http://www.uniremington.edu.co/aspirantes/admisiones.html");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }

        });


    }

}

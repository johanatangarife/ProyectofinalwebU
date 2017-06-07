package com.example.usuario.aplicacionweb;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class menu extends AppCompatActivity implements View.OnClickListener {

    Button aspirante;
    ImageButton moodle;
    ImageButton Q10;
    RadioGroup grupo;
    Button fotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        aspirante= (Button) findViewById(R.id.btimg);
        aspirante.setOnClickListener(this);

        fotos= (Button) findViewById(R.id.btnaspi);
        fotos.setOnClickListener(this);

        moodle = (ImageButton) findViewById(R.id.btnmoo);
        moodle.setOnClickListener(this);

        Q10 = (ImageButton) findViewById(R.id.btnq10);
        Q10.setOnClickListener(this);

        grupo = (RadioGroup) findViewById(R.id.grupo);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                String opcion = "";
                if (checkedId == R.id.rb2) {
                    opcion = "2";
                } else if (checkedId == R.id.rb3) {
                    opcion = "3";
                } else if (checkedId == R.id.rb4) {
                    opcion = "4";
                }
                Intent otro = new Intent(menu.this, intermedio.class);
                otro.putExtra("parametro", opcion);
                startActivity(otro);
            }
        });

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnmoo:
                Intent pg = new Intent(this, pagina.class);
                startActivity(pg);
                break;
            case R.id.btnq10:
                Intent pgq = new Intent(this, paginaq10.class);
                startActivity(pgq);
                break;
            case R.id.btnaspi:
                Intent Siguiente = new Intent(this, sedes.class);
                startActivity(Siguiente);
                break;
            case R.id.btimg:
                Intent ft = new Intent(this, imagen.class);
                startActivity(ft);

        }

    }
}
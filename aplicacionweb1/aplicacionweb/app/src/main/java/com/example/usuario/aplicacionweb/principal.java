package com.example.usuario.aplicacionweb;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class principal extends AppCompatActivity implements View.OnClickListener {


    Button ingresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ingresar = (Button) findViewById(R.id.btningre);
        ingresar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String usuario = ((EditText) findViewById(R.id.usu)).getText().toString();
                String contra = ((EditText) findViewById(R.id.pass)).getText().toString();
                if (usuario.equals("Admin") && contra.equals("1234") )
                {
                    Intent siguiente = new Intent(principal.this, menu.class);
                    startActivity(siguiente);
                    Toast.makeText(ingresar.getContext(), "Acceso Permitido", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ingresar.getContext(), "Acceso Denegado", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    public void onClick(View v) {


        Intent siguiente2 = new Intent(this, menu.class);
        startActivity(siguiente2);

    }
}


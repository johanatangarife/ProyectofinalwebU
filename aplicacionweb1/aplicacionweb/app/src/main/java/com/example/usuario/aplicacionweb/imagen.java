package com.example.usuario.aplicacionweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class imagen extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
        ToggleButton tbft;
        ImageView ft1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        tbft = (ToggleButton)findViewById(R.id.tbft);
        ft1 = (ImageView) findViewById(R.id.ft1);


        tbft.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (tbft.isChecked()){
            ft1.setImageResource(R.drawable.unim);
        }
        else{
            ft1.setImageResource(R.drawable.unimani);
        }
    }
}

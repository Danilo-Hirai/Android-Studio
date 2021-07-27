package com.example.signosapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Saibamais extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saibamais);

        voltar = (Button) findViewById(R.id.buttonVoltar);

        voltar.setOnClickListener(new View.OnClickListener () {

            public void onClick(View view) {
                finish();
            }
        });
    }
}

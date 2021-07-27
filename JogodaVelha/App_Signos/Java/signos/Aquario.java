package com.example.signosapp.signos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.signosapp.R;

public class Aquario extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquario);

        voltar = (Button) findViewById(R.id.buttonVoltar);

        voltar.setOnClickListener(new View.OnClickListener () {

            public void onClick(View view) {
                finish();
            }
        });
    }
}

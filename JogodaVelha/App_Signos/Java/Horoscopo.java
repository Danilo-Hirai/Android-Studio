package com.example.signosapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.signosapp.signos.Aquario;
import com.example.signosapp.signos.Aries;
import com.example.signosapp.signos.Cancer;
import com.example.signosapp.signos.Capricornio;
import com.example.signosapp.signos.Escorpiao;
import com.example.signosapp.signos.Gemeos;
import com.example.signosapp.signos.Leao;
import com.example.signosapp.signos.Libra;
import com.example.signosapp.signos.Peixes;
import com.example.signosapp.signos.Sagitario;
import com.example.signosapp.signos.Touro;
import com.example.signosapp.signos.Virgem;


public class Horoscopo extends AppCompatActivity {

    ImageButton btnaquario, btnpeixes, btnaries, btntouro, btngemeos, btncancer, btnleao, btnvirgem,
            btnlibra, btnescorpiao, btnsagitario, btncapricornio;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscopo);

        btnaquario = (ImageButton)  findViewById(R.id.btnaquario);
        btnpeixes = (ImageButton)  findViewById(R.id.btnpeixes);
        btnaries = (ImageButton)  findViewById(R.id.btnaries);
        btntouro = (ImageButton)  findViewById(R.id.btntouro);
        btngemeos = (ImageButton)  findViewById(R.id.btngemeos);
        btncancer = (ImageButton)  findViewById(R.id.btncancer);
        btnleao = (ImageButton)  findViewById(R.id.btnleao);
        btnvirgem = (ImageButton)  findViewById(R.id.btnvirgem);
        btnlibra = (ImageButton)  findViewById(R.id.btnlibra);
        btnescorpiao = (ImageButton)  findViewById(R.id.btnescorpiao);
        btnsagitario = (ImageButton)  findViewById(R.id.btnsagitario);
        btncapricornio = (ImageButton)  findViewById(R.id.btncapricornio);
        voltar = (Button) findViewById(R.id.buttonVoltar);

        voltar.setOnClickListener(new View.OnClickListener () {

            public void onClick(View view) {
                finish();
            }
        });
    }
    public void aquario (View view){
        Intent intent = new Intent(Horoscopo.this, Aquario.class);
        startActivity(intent);
    }
    public void peixes (View view){
        Intent intent = new Intent(Horoscopo.this, Peixes.class);
        startActivity(intent);
    }
    public void aries (View view){
        Intent intent = new Intent(Horoscopo.this, Aries.class);
        startActivity(intent);
    }
    public void touro (View view){
        Intent intent = new Intent(Horoscopo.this, Touro.class);
        startActivity(intent);
    }
    public void gemeos (View view){
        Intent intent = new Intent(Horoscopo.this, Gemeos.class);
        startActivity(intent);
    }
    public void cancer (View view){
        Intent intent = new Intent(Horoscopo.this, Cancer.class);
        startActivity(intent);
    }
    public void leao (View view){
        Intent intent = new Intent(Horoscopo.this, Leao.class);
        startActivity(intent);
    }
    public void virgem (View view){
        Intent intent = new Intent(Horoscopo.this, Virgem.class);
        startActivity(intent);
    }
    public void libra (View view){
        Intent intent = new Intent(Horoscopo.this, Libra.class);
        startActivity(intent);
    }
    public void escorpiao (View view){
        Intent intent = new Intent(Horoscopo.this, Escorpiao.class);
        startActivity(intent);
    }
    public void sagitario (View view){
        Intent intent = new Intent(Horoscopo.this, Sagitario.class);
        startActivity(intent);
    }
    public void capricornio (View view){
        Intent intent = new Intent(Horoscopo.this, Capricornio.class);
        startActivity(intent);
    }
}
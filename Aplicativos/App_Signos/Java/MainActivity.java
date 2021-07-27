package com.example.signosapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerDia = null;
    private Spinner spinnerMes = null;
    public Button btnhoroscopo;
    public Button btnsaibamais;

    private void validarData() {
        int dia = spinnerDia.getSelectedItemPosition();
        int mes = spinnerMes.getSelectedItemPosition();

        dia++;
        mes++;
        if (dia > 29 && mes == 2 ) {
            spinnerDia.setSelection(28);

            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.spinner_layout, null);
            dlg.setView(view);
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }

        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)){
            spinnerDia.setSelection(29);

            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.spinner_layout, null);
            dlg.setView(view);
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }

    //*METODO ONCREATE SERÁ EXECUTADO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // AQUI EU DEFINI QUAL É O LAYOUT (XML) QUE ESTÁ FAZENDO LIGAÇÃO COM O CÓDIGO JAVA

        spinnerDia = (Spinner) findViewById(R.id.spinnerDia); // AQUI VAI ATRIBUIR ESTES OBJETOS Á SPINNER DO LAYOUT
        spinnerMes = (Spinner) findViewById(R.id.spinnerMes); // AQUI VAI ATRIBUIR ESTES OBJETOS Á SPINNER DO LAYOUT
        btnhoroscopo = (Button) findViewById(R.id.btnhoroscopo);
        btnsaibamais = (Button) findViewById(R.id.btnsaibamais);

        // O ADAPTER VAI PEGAR UMA BASE DE DADOS, DO ARRAY,
        // PREENCHENDO OS CAMPOS NECESSÁRIOS COM OS DADOS RECEBIDOS
        // PEGAR O STRING.XML E INSERIR SPIINDER_DIA E SPINNER_MÊS
        ArrayAdapter<CharSequence> adapter_dia = ArrayAdapter.createFromResource(this, R.array.dias,
                android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> adapter_mes = ArrayAdapter.createFromResource(this, R.array.meses,
                android.R.layout.simple_spinner_item);

        adapter_dia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_mes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // AQUI MOSTRA O MENU COM BASE NO XML -- LISTAGEM
        spinnerDia.setAdapter(adapter_dia);
        spinnerMes.setAdapter(adapter_mes);

        spinnerDia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                validarData();
        }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinnerMes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                validarData();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Button enviar = (Button) findViewById(R.id.buttonEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int posicaoDia = spinnerDia.getSelectedItemPosition();
                int posicaoMes = spinnerMes.getSelectedItemPosition();

                posicaoDia++; // os itens, spinners começam a contar a partir do zero
                posicaoMes++; // os itens, spinners começam a contar a partir do zero

                InterpretadorSigno Interpretador = new InterpretadorSigno();

                Signo signoResultado = Interpretador.interpretar(posicaoDia, posicaoMes);

                Bundle args = new Bundle();
                args.putSerializable("resultado", signoResultado);

                Intent intent = new Intent(MainActivity.this, Resultado.class);
                intent.putExtra("signo", args);

                startActivity(intent);
            }
        });
    }
    public void  horoscopo (View view){
        Intent intent = new Intent(MainActivity.this, Horoscopo.class);
        startActivity(intent);
    }
    public void  saibamais (View view){
        Intent intent = new Intent(MainActivity.this, Saibamais.class);
        startActivity(intent);
    }
}

package com.teste.jogodavelha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button[] Button = new Button[10];
    private String vez = "X";
    private int jogadas = 0;
    private String[] matriz = new String[10];
    TextView placar1, placar2, placar3;
    int placarE = 0, placarX = 0, placarO = 0;
    ImageButton btnatualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnatualizar = (ImageButton) findViewById(R.id.btnatualizar);
        placar1 = (TextView) findViewById(R.id.placar1);
        placar2 = (TextView) findViewById(R.id.placar2);
        placar3 = (TextView) findViewById(R.id.placar3);
        Buttons();
        onClickButtons();
    }

    private void Buttons() {
        Button[1] = (Button) findViewById(R.id.btn1);
        Button[2] = (Button) findViewById(R.id.btn2);
        Button[3] = (Button) findViewById(R.id.btn3);
        Button[4] = (Button) findViewById(R.id.btn4);
        Button[5] = (Button) findViewById(R.id.btn5);
        Button[6] = (Button) findViewById(R.id.btn6);
        Button[7] = (Button) findViewById(R.id.btn7);
        Button[8] = (Button) findViewById(R.id.btn8);
        Button[9] = (Button) findViewById(R.id.btn9);
    }

    private void onClickButtons() {
        for (int X = 1; X < 10; X++) {
            final int finalX = X;
            Button[finalX].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jogada(finalX);
                }
            });
            matriz[X] = "";
        }
    }

    private void jogada(int X) {
        if (matriz[X] == "") {
            matriz[X] = vez;
            jogadas++;
            if (vez == "X") {
                vez = "O";
            } else {
                vez = "X";
            }
        }
        exibir();
        verifica();
    }

    private void exibir() {
        for (int X = 1; X < 10; X++) {
            Button[X].setText(matriz[X]);
        }
    }

    private void verifica() {
        if (matriz[1].equals(matriz[2]) && matriz[1].equals(matriz[3]) && matriz[1].toString() != "") {
            ganhador(matriz[1]);
            return;

        } if (matriz[4].equals(matriz[5]) && matriz[4].equals(matriz[6]) && matriz[4].toString() != "") {
            ganhador(matriz[4]);
            return;

        } if (matriz[7].equals(matriz[8]) && matriz[7].equals(matriz[9]) && matriz[7].toString() != "") {
            ganhador(matriz[7]);
            return;

        } if (matriz[1].equals(matriz[4]) && matriz[1].equals(matriz[7]) && matriz[1].toString() != "") {
            ganhador(matriz[1]);
            return;

        } if (matriz[2].equals(matriz[5]) && matriz[2].equals(matriz[8]) && matriz[2].toString() != "") {
            ganhador(matriz[2]);
            return;

        } if (matriz[3].equals(matriz[6]) && matriz[3].equals(matriz[9]) && matriz[3].toString() != "") {
            ganhador(matriz[3]);
            return;

        } if (matriz[1].equals(matriz[5]) && matriz[1].equals(matriz[9]) && matriz[1].toString() != "") {
            ganhador(matriz[1]);
            return;

        } if (matriz[3].equals(matriz[5]) && matriz[3].equals(matriz[7]) && matriz[3].toString() != "") {
            ganhador(matriz[3]);
            return;

        } if (jogadas == 9) {
            ganhador("");
            return;
        }
    }

    private void ganhador(String ganhador) {
        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
        dlg.setTitle("Resultado");
        if (ganhador.equals("")) {
            placarE++;
            dlg.setMessage("Empate");
        } else if (ganhador.equals("X")) {
            placarX++;
            dlg.setMessage("X é o  vencedor");
        } else {
            placarO++;
            dlg.setMessage("O é o vencedor");
        }
        placar1.setText("Jogador 1 = " + placarX);
        placar2.setText("Empates = " + placarE);
        placar3.setText("Jogador 2 = " + placarO);

        dlg.setPositiveButton("Novo Jogo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                jogadas = 0;
                vez = "X";
                for (int X = 1; X < 10; X++) {
                    matriz[X] = "";
                }
                exibir();
            }
        });
        AlertDialog alert = dlg.create();
        alert.show();
    }
    public void atualizar (View view){
        placarX=0;
        placarE=0;
        placarO=0;
        placar1.setText("");
        placar2.setText("");
        placar3.setText("");
    }
}

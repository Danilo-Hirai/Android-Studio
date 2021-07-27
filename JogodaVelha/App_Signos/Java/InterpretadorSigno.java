package com.example.signosapp;

import java.util.ArrayList;

public class InterpretadorSigno {

    //*FAZENDO A INICIALIÇÃO DA LISTA //*
    private ArrayList<Signo> signos = new ArrayList<Signo>() {{
        add(new Signo(20, 1, 18, 2,
                "Aquário!", "@drawable/aquario1"));

        add(new Signo(19, 2, 20, 3,
                "Peixes!", "@drawable/peixes1"));

        add(new Signo(21, 3, 19, 4,
                "Aries!", "@drawable/aries1"));

        add(new Signo(20, 4, 20, 5,
                "Touro!", "@drawable/touro1"));

        add(new Signo(21, 5, 20, 6,
                "Gêmeos!", "@drawable/gemeos1"));

        add(new Signo(21, 6, 22, 7,
                "Câncer!", "@drawable/cancer1"));

        add(new Signo(23, 7, 22, 8,
                "Leão!", "@drawable/leao1"));

        add(new Signo(23, 8, 22, 9,
                "Virgem!", "@drawable/virgem1"));

        add(new Signo(23, 9, 22, 10,
                "Libra!", "@drawable/libra1"));

        add(new Signo(23, 10, 21, 11,
                "Escorpiao!", "@drawable/escorpiao1"));

        add(new Signo(22, 11, 21, 12,
                "Sagitario!", "@drawable/sagitario1"));

        add(new Signo(22, 12, 19, 1,
                "Capricornio!", "@drawable/capricornio1"));
    }};

        public Signo interpretar(int dia, int mes){
            Signo signo = null; //*VAI GUARDAR O SIGNO SELECIONADO PELA ESTRUTURA DE SELEÇÃO

            for (Signo s : signos){
                if (s.getMesInicio() == mes && dia >= s.getDiaInicio()){
                    signo = s;
                    break;
                } else if (s.getMesFim()== mes && dia <= s.getDiaFim()){
                    signo = s;
                    break;
                }
            }
            return signo;
        }
}


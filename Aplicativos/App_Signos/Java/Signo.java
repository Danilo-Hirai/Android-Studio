package com.example.signosapp;


import java.io.Serializable;

public class Signo implements Serializable {

    //*atributos privados **/
    private int diainicio;
    private int diafim;
    private int mesinicio;
    private int mesfim;
    private String nome;
    private String imagem;


    public Signo() {
    }
        /*sobrecarga construtor*/
    public Signo(int diainicio, int mesinicio, int diafim, int mesfim, String nome, String imagem){
        /*sobrecarga construtor, pegar os atributos que a classe já tem */
        this.diainicio = diainicio;
        this.diafim = diafim;
        this.mesinicio = mesinicio;
        this.mesfim = mesfim;
        this.nome = nome;
        this.imagem = imagem;
    }

    /*retorna os dados de cada signo */
    /*essa classe representa um Signo */
    public int getDiaInicio() { return diainicio ; }
    public int getDiaFim () { return diafim ; }
    public int getMesInicio () { return mesinicio ; }
    public int getMesFim () { return mesfim ; }
    public String getNome() { return nome ; }
    public String getImagem() { return imagem ; }
}

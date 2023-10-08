package com.example.semoc;

import android.widget.ImageView;

import java.io.Serializable;

public class Palestrante implements Serializable {

    private String nome;
    private String conteudo;





    public Palestrante(String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}

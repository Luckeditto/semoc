package com.example.semoc;

import java.io.Serializable;

public class Evento implements Serializable {

    private  String titulo;
    private String descricao;


    public Evento(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }



    public String getTitulo() {
        return titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

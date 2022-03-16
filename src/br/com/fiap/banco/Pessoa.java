package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String Nome){
        this.nome = nome;
    }


}

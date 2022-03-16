package br.com.fiap.banco;

import java.io.Serializable;

public class Conta implements Serializable {

    // Atributos de classe
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(){ // CONSTRUTOR PADRÃO

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor){ //deposita valor ao saldo

        this.saldo += valor;
    }

    public void retirar(double valor){ //saca o valor do saldo

        this.saldo -= valor;
    }

    public double getSaldo(){ //mostra o valor atual do saldo
        return  this.saldo;
    }



}

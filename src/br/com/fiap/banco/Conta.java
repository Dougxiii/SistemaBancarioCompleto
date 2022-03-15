package br.com.fiap.banco;

public class Conta {
    // Atributos de classe
    int agencia;
    int numero;
    double saldo;

    public Conta(){ // CONSTRUTOR PADRÃO

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor){ //deposita valor ao saldo

        this.saldo += valor;
    }

    public void retirar(double valor){ //saca o valor do saldo

        this.saldo -= valor;
    }

    public double verificarSaldo(){ //mostra o valor atual do saldo
        return  this.saldo;
    }



}

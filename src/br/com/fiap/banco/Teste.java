package br.com.fiap.banco;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Conta cc = new Conta();
        cc.depositar(50.89);
        cc.setAgencia(123);
        cc.setNumero(987);

        cc.depositar(1000);

        System.out.println(cc.getSaldo());

        Conta contaPoupanca = new Conta(111,222,1000);

        contaPoupanca.depositar(650.99);
        System.out.println(contaPoupanca.getSaldo());

        contaPoupanca.retirar(50.99);
        System.out.println(contaPoupanca.getSaldo());

        /*
        //TESTANDO ENTRADA DE DADOS

        Conta cc2 = new Conta();
        System.out.println("Agencia: ");
        cc2.getAgencia() = leitor.nextInt();
        System.out.println("Numero: ");
        cc2.setNumero() = leitor.nextInt();

        cc2.depositar(500);
        System.out.println("agencia: " + cc2.getAgencia());
        System.out.println("numero: " + cc2.getNumero());
        System.out.println("saldo: " + cc2.getSaldo());
        */




    }
}

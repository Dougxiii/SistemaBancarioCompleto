package br.com.fiap.banco;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero = 987;

        cc.depositar(1000);

        System.out.println(cc.verificarSaldo());

        Conta contaPoupanca = new Conta(111,222,1000);

        contaPoupanca.depositar(650.99);
        System.out.println(contaPoupanca.verificarSaldo());

        contaPoupanca.retirar(50.99);
        System.out.println(contaPoupanca.verificarSaldo());

        //TESTANDO ENTRADA DE DADOS

        Conta cc2 = new Conta();
        System.out.println("Agencia: ");
        cc2.agencia = leitor.nextInt();
        System.out.println("Numero: ");
        cc2.numero = leitor.nextInt();

        cc2.depositar(500);
        System.out.println("agencia: " + cc2.agencia);
        System.out.println("numero: " + cc2.numero);
        System.out.println("saldo: " + cc2.verificarSaldo());





    }
}

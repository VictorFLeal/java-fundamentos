package com.victordev.DIA3;

public class ATV02 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Victor", 10);
        ContaBancaria contaBancaria02 = new ContaBancaria("Emilly", 9);

        contaBancaria01.depositar(500);
        contaBancaria01.sacar(1000);

        contaBancaria02.depositar(500);
        contaBancaria02.sacar(250);

        System.out.println("Saldo Victor: " + contaBancaria01.getSaldo());
        System.out.println("Saldo Emilly: " + contaBancaria02.getSaldo());

    }
}

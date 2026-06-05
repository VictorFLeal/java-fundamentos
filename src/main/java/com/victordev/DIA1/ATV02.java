package com.victordev.DIA1;
/*
Exercício 2 — Calculadora de desconto
Uma loja dá desconto baseado no valor da compra:

Abaixo de R$100 → sem desconto
Entre R$100 e R$299 → 10% de desconto
R$300 ou mais → 20% de desconto

Dado um valor de compra, exiba o valor final a pagar.
 */
public class ATV02 {
    public static void main(String[] args) {
        double valor = 100;

        if (valor < 100) {
            System.out.println("Abaixo de R$100,00 sem desconto!");
            System.out.println("Valor final: " + valor);

        } else if (valor >= 100 && valor <= 299) {
            double valorFinal = valor - (valor * 0.10);

            System.out.println("Parabéns, você ganhou 10% de desconto!");
            System.out.println("Valor final: " + valorFinal);
        }

        else {
            double valorFinal = valor - (valor * 0.20);

            System.out.println("Parabéns, você ganhou 20%  de desconto!");
            System.out.println("Valor final: " + valorFinal);
        }
    }
}

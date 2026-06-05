package com.victordev.DIA1;
/*
Exercício 3 — Tabuada personalizada
Dado um número, exiba a tabuada dele de 1 a 10 no formato:
3 x 1 = 3
 */
public class ATV03 {
    public static void main(String[] args) {
        int numero = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

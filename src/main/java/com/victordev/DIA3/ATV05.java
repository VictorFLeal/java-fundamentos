package com.victordev.DIA3;
/*
Exercício 5 — Tabuada de múltiplos
Exiba todos os múltiplos de 3 entre 1 e 100. Na linha de cada múltiplo, exiba também se ele é par ou ímpar. Exemplo: "15 - ímpar".
 */
public class ATV05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                if (i % 2 == 0) {
                    System.out.println(i + " - par");
                } else {
                    System.out.println(i + " - ímpar");
                }
            }
        }
    }
}

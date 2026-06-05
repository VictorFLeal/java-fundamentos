package com.victordev.DIA1;
/*
Exercício 4 — Contador de ímpares
Dado um intervalo de 1 até 50, exiba apenas os números ímpares. Use continue pra pular os pares.
 */
public class ATV04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}

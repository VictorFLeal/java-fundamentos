package com.victordev.DIA3;
/*
Exercício 3 — Contador regressivo com parada
Faça uma contagem regressiva de 20 até 1. Se chegar no número 7, exiba "Atenção: número 7 encontrado!" e pare a contagem.
 */
public class ATV03 {
    public static void main(String[] args) {

        for (int i = 20; i >= 1; i--) {
            System.out.println(i);

            if (i == 7) {
                System.out.println("Atenção: número 7 encontrado!");
                break;
            }
        }
    }
}

package com.victordev.DIA1;
/*
Exercício 1 — Classificador de candidatos
Uma empresa só aceita candidatos com idade entre 18 e 35 anos. Dado um valor de idade, exiba se o candidato está "Aprovado" ou "Reprovado".
 */
public class ATV01 {
    public static void main(String[] args) {
        int idade = 21;

        if (idade >= 18 && idade <= 35) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}

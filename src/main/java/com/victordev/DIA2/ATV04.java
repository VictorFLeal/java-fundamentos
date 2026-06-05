package com.victordev.DIA2;
/*
Exercício 4 — Classificador de notas
Dada uma nota de 0 a 10, exiba a situação do aluno:

9 a 10 → "Excelente"
7 a 8 → "Aprovado"
5 a 6 → "Recuperação"
abaixo de 5 → "Reprovado"
 */
public class ATV04 {
    public static void main(String[] args) {
        double nota = 7;

        if (nota > 8) {
            System.out.println("Excelente");
        } else if (nota > 6) {
            System.out.println("Aprovado");
        } else if (nota > 4) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}

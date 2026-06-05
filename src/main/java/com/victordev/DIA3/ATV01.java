package com.victordev.DIA3;
/*
Exercício 1 — Dia da semana
Dado um número de 1 a 7, exiba o nome do dia correspondente usando switch. Se o número for inválido, exiba "Dia inválido".
 */
public class ATV01 {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case  5:
                System.out.println("Quinta-Feira");
                break;

            case  6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Dia inválido");
        }
    }
}

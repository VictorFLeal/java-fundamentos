package com.victordev.DIA3;
/*
Exercício 2 — Calculadora simples
Dados dois números e um operador (+, -, *, /) em variáveis fixas, calcule e exiba o resultado usando switch. Trate divisão por zero exibindo "Erro: divisão por zero".
 */
public class ATV02 {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 0;
        double resultado;
        char operador = '/';

        switch (operador) {
            case '+':
                resultado = num1 + num2;

                System.out.println("O resultado desse calculo: " + resultado);
                break;

            case  '-':
                resultado = num1 - num2;

                System.out.println("O resultado desse calculo: " + resultado);
                break;

            case  '*':
                resultado = num1 * num2;

                System.out.println("O resultado desse calculo: " + resultado);
                break;

            case   '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero");
                }
                else {
                    resultado = num1 / num2;

                    System.out.println("O resultado desse calculo: " + resultado);
                }
                break;

            default:
                System.out.println("operador inválido");
        }

    }
}

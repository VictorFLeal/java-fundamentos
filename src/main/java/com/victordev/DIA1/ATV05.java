package com.victordev.DIA1;
/*
Exercício 5 — Validador de senha
O sistema aceita no máximo 3 tentativas de senha. A senha correta é 1234. Simule as tentativas com valores fixos no código (sem Scanner por enquanto) e exiba "Acesso liberado" ou "Conta bloqueada" conforme o resultado.
 */
public class ATV05 {
    public static void main(String[] args) {
        int senha = 1234;
        boolean acertou = false;

        for (int i = 1; i <= 3; i++) {
            if (senha == 1234) {
                acertou = true;
                break;
            }
        }

        if (acertou) {
            System.out.println("Acesso liberado");
        }
        else {
            System.out.println("Conta bloqueada");
        }

    }
}

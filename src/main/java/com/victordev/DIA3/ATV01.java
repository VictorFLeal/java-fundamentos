package com.victordev.DIA3;

public class ATV01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa("Victor", 21, "078.066.251-27");
        Pessoa pessoa02 = new Pessoa("Emilly", 10, "218.946.242-29");
        System.out.println("Nome: " + pessoa01.getNome() + "\nIdade: " + pessoa01.getIdade() + "\nCPF: " + pessoa01.getCpf() + "\nDataCadastro: " + pessoa01.getDataCadastro() + "\n-------------------------------");

        System.out.println("Nome: " + pessoa02.getNome() + "\nIdade: " + pessoa02.getIdade() + "\nCPF: " + pessoa02.getCpf() + "\nDataCadastro: " + pessoa02.getDataCadastro() + "\n-------------------------------");
    }
}

package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        long anteriorAtual = 0;
        long atual = 1;
        long soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma = atual + anteriorAtual;
            System.out.println(i + "º " + atual);
            anteriorAtual = atual;
            atual = soma;
        }
    }
}

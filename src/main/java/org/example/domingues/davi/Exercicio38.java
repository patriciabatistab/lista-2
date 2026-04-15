package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int divisores = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("Número primo!");
        } else {
            System.out.println("Número não primo!");
        }
    }
}

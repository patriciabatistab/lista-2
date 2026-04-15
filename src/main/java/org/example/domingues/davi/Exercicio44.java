package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a quantidade de números: ");
        int quantidade = scanner.nextInt();

        int somaTotal = 0;
        int maximo = 1;
        while (maximo <= quantidade) {
            System.out.print("Insira um valor: ");
            somaTotal += scanner.nextInt();
            maximo++;
        }

        System.out.printf("Média aritmética: %.2f", ((somaTotal / quantidade)) * 1.0);
    }
}

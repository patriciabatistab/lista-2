package org.example.patricia;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaTotal = 0;
        int maximo = 1;
        while (maximo <= 500){
            System.out.print("Insira um valor: ");
            somaTotal += scanner.nextInt();
            maximo++;
        }

        System.out.printf("Média aritmética: %.2f", ((somaTotal / 500)) * 1.0);
    }
}

package org.example.patricia;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int qtd = scanner.nextInt();

        String asteristico = "*";

        for (int i = 1; i <= qtd; i++) {
            System.out.println(asteristico.repeat(i));
        }
    }
}

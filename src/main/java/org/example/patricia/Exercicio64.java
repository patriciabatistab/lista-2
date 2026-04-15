package org.example.patricia;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos: ");
        int qtdTriangulo = scanner.nextInt();

        String asteristico = "*";
        for (int i = 1; i <= qtdTriangulo; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(asteristico.repeat(j));
            }
            System.out.println("");
        }
    }
}

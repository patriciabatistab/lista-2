package org.example.richard;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas:");
        int qtd = scan.nextInt();

        for (int i = 1; i <= qtd; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < 10){
                    System.out.printf("0%d ", j);
                } else {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
        }
    }
}

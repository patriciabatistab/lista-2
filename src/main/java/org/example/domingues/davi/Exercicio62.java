package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int colunas = 1;
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= colunas; j++) {
                System.out.printf("%02d ", colunas);
            }
            System.out.println();
            colunas++;
        }
    }
}

package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int lines = sc.nextInt();
        int columns = lines;

        int asterisks = 1;
        int spaces = lines - asterisks;
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asterisks; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
            asterisks += 2;
            spaces -= 1;
        }
    }
}

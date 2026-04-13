package org.example.richard;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens na turma: ");
        int homens = scan.nextInt();

        System.out.println("Digite a quantidade de mulheres na turma:");
        int mulheres = scan.nextInt();

        int total = homens + mulheres;

        double percentHomens = (double) (homens * 100) / total;
        double percentMulheres = (double) (mulheres * 100) / total;

        System.out.printf("Porcentagem de homens: %f", percentHomens);
        System.out.printf("Porcentagem de mulheres: %f", percentMulheres);
    }
}

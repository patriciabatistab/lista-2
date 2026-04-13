package org.example.richard;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

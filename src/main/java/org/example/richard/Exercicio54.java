package org.example.richard;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        double vInicial = scan.nextDouble();
        System.out.println("Digite o valor final: ");
        double vFinal = scan.nextDouble();
        System.out.println("Digite o valor de incremento: ");
        double incremento = scan.nextDouble();
        System.out.println("Digite o valor do dólar");
        double dolar = scan.nextDouble();

        System.out.println("\n--- Tabela de conversão ---");
        System.out.printf("%-15s | %-15s%n", "Reais (R$)", "Dólares (US$)");
        System.out.println("---------------------------------------");

        for (double i = vInicial; i <= vFinal; i += incremento) {
            double conversao = i / dolar;
            System.out.printf("R$ %-12.2f | US$ %-12.2f%n", i, conversao);
        }
    }
}

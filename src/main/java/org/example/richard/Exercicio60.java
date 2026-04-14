package org.example.richard;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor inicial da dívida:");
        double divida = scan.nextDouble();

        System.out.println("Digite a taxa de correção mensal:");
        double taxa = scan.nextDouble() / 100;

        System.out.println("Digite a quantidade de anos:");
        int anos = scan.nextInt();

        String[] meses = {
                "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        int anoCorrente = 2007;

        System.out.println("\n--- Tabela de Evolução da Dívida ---");
        System.out.printf("%-10s | %-10s | %-15s%n", "Ano", "Mês", "Valor (R$)");
        System.out.println("----------------------------------------");

        for (int i = 0; i < anos; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%-10d | %-10s | R$ %-12.2f%n", anoCorrente, meses[j], divida);
                divida += (divida * taxa);
            }
            anoCorrente++;
        }
    }
}

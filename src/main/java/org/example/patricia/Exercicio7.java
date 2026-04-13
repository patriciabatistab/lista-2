package org.example.patricia;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o gasto total do cliente: ");
        Double total = scanner.nextDouble();

        System.out.println("A comissão será de: " + total * 0.10);
    }
}

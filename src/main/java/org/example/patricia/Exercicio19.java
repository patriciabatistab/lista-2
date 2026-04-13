package org.example.patricia;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o 2º valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2){
            System.out.println(valor2 + " " + valor1);
        } else {
            System.out.println(valor1 + " " + valor2);

        }

    }
}

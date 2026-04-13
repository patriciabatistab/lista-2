package org.example.patricia;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) +"ª nota: ");
            total+= scanner.nextDouble();
        }

        double mediaAritmetica = total / 4;
        System.out.println("Média aritmética: " +mediaAritmetica);
    }
}

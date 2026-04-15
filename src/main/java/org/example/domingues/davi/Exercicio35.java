package org.example.domingues.davi;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade: ");
        int qtd = input.nextInt();
        System.out.print("Min: ");
        int min = input.nextInt();
        System.out.print("Max: ");
        int max = input.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print(ThreadLocalRandom.current().nextInt(min, max) + " ");
        }
    }
}

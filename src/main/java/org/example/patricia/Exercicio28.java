package org.example.patricia;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + i + 1 + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length -1; j++) {
                if (numeros[i] < numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}

package org.example.richard;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 100 valores para serem comparados:");
        int maior = 1;

        for (int i = 0; i < 100; i++) {
            int num = scan.nextInt();

            if(num > maior){
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}

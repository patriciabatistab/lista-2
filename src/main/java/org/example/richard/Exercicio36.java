package org.example.richard;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        int numMaior = 0;
        int numMenor = 0;
        if (num1 > num2){
            numMaior = num1;
            numMenor = num2;
        } else {
            numMaior = num2;
            numMenor = num1;
        }

        for (int i = numMenor; i < numMaior; i++) {
            if (!(i % 2 == 0)){
                System.out.println(i);
            }
        }
    }
}

package org.example.richard;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        /*
        Verifique se um número é perfeito, ou seja,
        se a soma dos seus divisores (exceto o próprio número) é igual a ele mesmo.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();

        int soma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                soma += i;
            }
        }

        if(soma == num){
            System.out.println("Esse número é perfeito, a soma é: " + soma);
        } else {
            System.out.println("Esse número não é perfeito, a soma é: " + soma);
        }
    }
}

package org.example.richard;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int n = scan.nextInt();
        int t0 = 1 ;
        int t1 = 1;
        int t2 = 2;

        for (int i = 3; i < n; i++) {
            int prox = t0 + t1 + t2;
            System.out.print(prox + " ");
            t0 = t1;
            t1 = t2;
            t2 = prox;
        }
    }
}
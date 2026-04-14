package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade do salário mínimo: ");
        double salarioMin = sc.nextInt();

        System.out.print("Quantidade do seu salário: ");
        double salario= sc.nextInt();

        System.out.printf("Você ganha %.2f salários mínimos", salario/salarioMin);
    }
}

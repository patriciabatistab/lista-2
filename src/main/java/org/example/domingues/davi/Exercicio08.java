package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Numerador: ");
        int numerador = input.nextInt();

        System.out.print("Denominador: ");
        int denominador =  input.nextInt();

        if (denominador == 0) {
            System.out.println("Denominador não pode ser zero!");
        } else {
            System.out.println("Resultado: " + ((double) numerador / (double) denominador));
        }
    }
}

package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        if (idade < 16) {
            System.out.println("Ainda não pode votar :(");
        } else
        if (idade < 18) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatório!");
        }
    }
}

package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.println("---- Pessoa 1 ----");
        System.out.print("Nome: ");
        String nome1 = inputString.nextLine();
        System.out.print("Idade: ");
        int idade1 = inputInt.nextInt();

        System.out.println("---- Pessoa 2 ----");
        System.out.print("Nome: ");
        String nome2 = inputString.nextLine();
        System.out.print("Idade: ");
        int idade2 = inputInt.nextInt();

        if (idade1 > idade2) {
            System.out.printf("""
                    Pessoa mais velha: %s
                    Pessoa mais nova: %s
                    """, nome1, nome2);
        } else if (idade1 < idade2) {
            System.out.printf("""
                    Pessoa mais velha: %s
                    Pessoa mais nova: %s
                    """, nome2, nome1);
        } else {
            System.out.printf("%s e %s tem mesma idade!", nome1, nome2);
        }

    }
}

package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.println("---- Pessoa 1 ----");
        System.out.print("Nome: ");
        String nome1 = inputString.nextLine();
        System.out.print("Dia: ");
        int dia1 = inputInt.nextInt();
        System.out.print("Mês: ");
        int mes1 = inputInt.nextInt();

        System.out.println("---- Pessoa 2 ----");
        System.out.print("Nome: ");
        String nome2 = inputString.nextLine();
        System.out.print("Idade: ");
        int dia2 = inputInt.nextInt();
        System.out.print("Mês: ");
        int mes2 = inputInt.nextInt();

        System.out.println("Primeiro aniversariante:");
        if (mes1 > mes2) {
            System.out.println(nome2);
        } else if (mes1 < mes2) {
            System.out.println(nome1);
        } else {
            if (dia1 > dia2) {
                System.out.println(nome2);
            } else if (dia1 < dia2) {
                System.out.println(nome1);
            } else {
                System.out.println("Fazem juntos!");
            }
        }


    }
}

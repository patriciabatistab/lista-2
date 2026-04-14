package org.example.patricia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º dia e mês de aniversário(dd/mm): ");
        String data1 = scanner.nextLine();

        System.out.print("Digite o 2º dia e mês de aniversário(dd/mm): ");
        String data2 = scanner.nextLine();

        if (data1.equals(data2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }

    }
}

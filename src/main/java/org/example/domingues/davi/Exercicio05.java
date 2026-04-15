package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Valor da inicial dívida: ");
        double valorInicial = input.nextDouble();

        System.out.print("Quantidade de meses: ");
        int meses = input.nextInt();

        System.out.print("Porcentagem da taxa: ");
        double taxa = input.nextDouble();

        double valorFinal = valorInicial + (valorInicial * meses * taxa);

        System.out.println("Dívida final: " + (valorFinal));
    }
}

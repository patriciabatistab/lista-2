package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] meses = {
                "Janeiro",
                "Fevereiro",
                "Março",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Outubro",
                "Novembro",
                "Dezembro"
        };

        System.out.println("Digite o nome do mês: ");
        String nome = input.nextLine();

        for (int i = 0; i < meses.length; i++) {
            if(nome.equalsIgnoreCase(meses[i])) {
                System.out.println("Número do mês: " + (1 + i));
                return;
            }
        }

        System.out.println("Mês inválido");
    }
}

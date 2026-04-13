package org.example.patricia;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado = "";
        if (media >= 7.0) {
            resultado = "Aprovado!";
        } else if (media >= 5.0 && media < 7.0) {
            resultado = "Recuperação!";
        } else {
            resultado = "Reprovado!";
        }

        if (!resultado.equals("Recuperação!")){
            System.out.println(resultado);
        } else {
            System.out.println("Nota da prova de recuperação: ");
            double notaRecup = scan.nextDouble();

            resultado = (notaRecup>=5)? "Aprovado!" : "Reprovado!";

            System.out.println(resultado);
        }
    }
}

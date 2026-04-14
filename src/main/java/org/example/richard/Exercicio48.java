package org.example.richard;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas:");
        int qtd = scan.nextInt();
        int soma = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite a nota: ");
            int nota = scan.nextInt();
            soma += nota;

            System.out.println("Nota adicionada: " + nota);
        }

        int media = soma / qtd;

        System.out.println("Digite a quantidade de faltas: ");
        double faltas = scan.nextDouble();
        System.out.println("Digite a quantidade total de aulas");
        double totalAulas = scan.nextDouble();
        double percentFaltas = faltas / totalAulas;

        if(percentFaltas > 0.25){
            System.out.println("Aluno reprovado por faltas! (Excede a 25% de faltas: " + percentFaltas * 100 + "%)");
            return;
        } else {
            System.out.println("Quantidade de faltas aceitável: " + percentFaltas * 100 + "%");
        }

        if(media >= 6){
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 4){
            System.out.println("Aluno de recuperação! Média: " + media);
        } else {
            System.out.println("Aluno reprovado por nota! Média: " + media);
        }
    }
}

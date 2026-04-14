package org.example.patricia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> idades = new ArrayList<>();
        int idade = 0;

        while (true) {
            System.out.printf("Idade da %dª pessoa: (-1 para sair)", idades.size() + 1);
            idade = scanner.nextInt();
            if (idade == -1){
                break;
            }
            if (idade > 0) {
                idades.add(idade);
            } else {
                System.out.println("Idade inválida");
            }
        }

        int somaIdades = 0;
        int adultos = 0;
        int maiorIdade = idades.getFirst();
        int menorIdade = idades.getFirst();

        for (Integer idadeAtual : idades) {
            somaIdades += idadeAtual;

            if (idadeAtual >= 18) {
                adultos++;
            }

            if (idadeAtual > maiorIdade) {
                maiorIdade = idadeAtual;
            } else if (idadeAtual < menorIdade) {
                menorIdade = idadeAtual;
            }
        }

        double media = (somaIdades / idades.size()) * 1.0;
        System.out.println(media);
        System.out.printf("""
                Média das idades: %.2f
                Maior idade: %d
                Menor idade: %d
                Quantidade de pessoas maior de idade: %d
                """, media, maiorIdade, menorIdade, adultos);
    }
}

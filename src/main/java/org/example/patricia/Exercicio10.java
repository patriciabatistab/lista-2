package org.example.patricia;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto:  ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor dos descontos total:  ");
        double descontos = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado:  ");
        double emprestimo = scanner.nextDouble();

        double salarioLiquio = salarioBruto - descontos;

        String emprestimoViavel = (salarioLiquio * 0.30 >= emprestimo)? "Aprovado":"Reprovado";

        System.out.println("Empréstimo " +emprestimoViavel);
    }
}

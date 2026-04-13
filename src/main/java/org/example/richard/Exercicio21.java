package org.example.richard;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cargo do usuário:");
        String cargo = scan.nextLine().toLowerCase();

        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();
        double emprestimo = 0.0;

        if(cargo.equals("diretoria")){
            emprestimo = 0.3;
        } else if (cargo.equals("gerência")){
            emprestimo = 0.25;
        } else if (cargo.equals("operacional")){
            emprestimo = 0.2;
        } else {
            System.out.println("Cargo Inválido!");
            return;
        }

        double total = salario * emprestimo;

        System.out.println("O valor possível de emprestimo é de: " + total);

    }


}

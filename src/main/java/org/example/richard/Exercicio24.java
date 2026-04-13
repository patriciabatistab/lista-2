package org.example.richard;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia do mês:");
        int dia = scan.nextInt();

        System.out.println("Digite um mês:");
        int mes = scan.nextInt();

        System.out.println("Digite um ano:");
        int ano = scan.nextInt();

        if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
            System.out.println("Dia Inválido! Mês possui apenas 30 dias!");
        } else if (!(ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) && mes == 2 && dia > 28){
            System.out.println("Dia inválido! Fevereiro possui apenas 28 dias nesse ano!");
        } else if (mes > 12 || dia > 31 || dia <= 0) {
            System.out.println("Dados Inválidos!");
        } else if (ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0) {
            System.out.printf("Dia: %d, Mês: %s, Ano: %s , Ano bissexto", dia, mes, ano);
        } else {
            System.out.printf("Dia: %d, Mês: %s, Ano: %s", dia, mes, ano);
        }
    }
}

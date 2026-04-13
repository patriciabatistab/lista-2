package org.example.patricia;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia do aniversário:");
        int dia = scan.nextInt();
        System.out.println("Digite o mês do aniversário");
        int mes = scan.nextInt();
        String nomeMes = "";

        switch (mes){
            case 1 -> nomeMes = "Janeiro";
            case 2 -> nomeMes = "Fevereiro";
            case 3 -> nomeMes = "Março";
            case 4 -> nomeMes = "Abril";
            case 5 -> nomeMes = "Maio";
            case 6 -> nomeMes = "Junho";
            case 7 -> nomeMes = "Julho";
            case 8 -> nomeMes = "Agosto";
            case 9 -> nomeMes = "Setembro";
            case 10 -> nomeMes = "Outubro";
            case 11 -> nomeMes = "Novembro";
            case 12 -> nomeMes = "Dezembro";
            default -> System.out.println("Mês inválido");
        }

        if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30){
            System.out.println("Dia Inválido!, Mês possui apenas 30 dias!");
        } else if (mes == 2 && dia > 29){
            System.out.println("Dia inválido!, Fevereiro possui apenas 29 dias!");
        } else if (mes > 12 || dia > 31 || dia <= 0) {
            System.out.println("Dados Inválidos!");
        } else {
            System.out.printf("Dia: %d, Mês: %s\n", dia, nomeMes);
        }

        if (mes < 4){
            System.out.println("Você nasceu no 1º semestre");
        } else if (mes < 7) {
            System.out.println("Você nasceu no 2º semestre");
        } else if (mes < 10) {
            System.out.println("Você nasceu no 3º semestre");
        } else {
            System.out.println("Você nasceu no 4º semestre");

        }
    }
}

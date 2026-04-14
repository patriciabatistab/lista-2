package org.example.richard;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia do aniversário:");
        int dia = scan.nextInt();
        System.out.println("Digite o mês do aniversário");
        int mes = scan.nextInt();
        System.out.println("Digite o ano do aniversário");
        int ano = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite a data atual:");
        String dataAtual = scan.nextLine();

        String[] partes = dataAtual.split("/");
        int diaAtual = Integer.parseInt(partes[0]);
        int mesAtual = Integer.parseInt(partes[1]);
        int anoAtual = Integer.parseInt(partes[2]);

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
            System.out.printf("Dia: %d, Mês: %s, Ano: %s\n", dia, nomeMes, ano);
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
        System.out.println(getSigno(dia, mes));

        int idade = anoAtual - ano;
        if (mesAtual < mes) {
            idade = idade - 1;
        }
        else if (mesAtual == mes) {
            if (diaAtual < dia) {
                idade = idade - 1;
            }
        }

        System.out.println("Sua idade atual é: " + idade + " anos.");
    }

    static String getSigno(int dia, int mes) {
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricórnio";
        }
        if (mes == 1 || mes == 2 && dia <= 18) {
            return "Aquário";
        }
        if (mes == 2 || mes == 3 && dia <= 20) {
            return "Peixes";
        }
        if (mes == 3 || mes == 4 && dia <= 20) {
            return "Áries";
        }
        if (mes == 4 || mes == 5 && dia <= 20) {
            return "Touro";
        }
        if (mes == 5 || mes == 6 && dia <= 20) {
            return "Gêmeos";
        }
        if (mes == 6 || mes == 7 && dia <= 22) {
            return "Câncer";
        }
        if (mes == 7 || mes == 8 && dia <= 22) {
            return "Leão";
        }
        if (mes == 8 || mes == 9 && dia <= 22) {
            return "Virgem";
        }
        if (mes == 9 || mes == 10 && dia <= 22) {
            return "Libra";
        }
        if (mes == 10 || mes == 11 && dia <= 21) {
            return "Escorpião";
        }
        if (mes == 11 || mes == 12) {
            return "Sagitário";
        }
        return "Data Inválida";
    }
}

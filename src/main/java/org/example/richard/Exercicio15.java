package org.example.richard;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia do aniversário:");
        int dia = scan.nextInt();
        System.out.println("Digite o mês do aniversário");
        int mes = scan.nextInt();
        String nomeMes = "";

        if(mes == 1){
            nomeMes = "Janeiro";
        }
        if(mes == 2){
            nomeMes = "Fevereiro";
        }
        if(mes == 3){
            nomeMes = "Março";
        }
        if(mes == 4){
            nomeMes = "Abril";
        }
        if(mes == 5){
            nomeMes = "Maio";
        }
        if(mes == 6){
            nomeMes = "Junho";
        }
        if(mes == 7){
            nomeMes = "Julho";
        }
        if(mes == 8){
            nomeMes = "Agosto";
        }
        if(mes == 9){
            nomeMes = "Setembro";
        }
        if(mes == 10){
            nomeMes = "Outubro";
        }
        if(mes == 11){
            nomeMes = "Novembro";
        }
        if(mes == 12){
            nomeMes = "Dezembro";
        }

        if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30){
            System.out.println("Dia Inválido!, Mês possui apenas 30 dias!");
        } else if (mes == 2 && dia > 29){
            System.out.println("Dia inválido!, Fevereiro possui apenas 29 dias!");
        } else if (mes > 12 || dia > 31 || dia <= 0) {
            System.out.println("Dados Inválidos!");
        } else {
            System.out.printf("Dia: %d, Mês: %s", dia, nomeMes);
        }
    }
}

package org.example.richard;

import com.sun.source.tree.ReturnTree;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira data:");
        System.out.println("Digite o dia:");
        int dia1 = scan.nextInt();
        System.out.println("Digite o mês:");
        int mes1 = scan.nextInt();
        System.out.println("Digite o ano:");
        int ano1 = scan.nextInt();

        System.out.println("Informe a segunda data:");
        System.out.println("Digite o dia:");
        int dia2 = scan.nextInt();
        System.out.println("Digite o mês:");
        int mes2 = scan.nextInt();
        System.out.println("Digite o ano:");
        int ano2 = scan.nextInt();

        int contador = 0;

        for (int i = 0; contador < 1 ; i++) {
            System.out.printf("%d/%d/%d\n", dia1, mes1, ano1);
            if((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) && dia1 > 30){
                dia1 ++;
                mes1 ++;
            }

            if(mes1 == 2 && dia1 < 28){
                dia1 ++;
            } else if (mes1 == 2 && dia1 > 28){
                mes1 ++;
                dia1 = 1;
            }

            if(dia1 < 31){
                dia1 ++;
            }

            if(dia1 == 31){
                dia1 = 1;
                mes1 ++;
            }

            if(mes1 == 12){
                mes1 = 1;
                dia1 = 1;
                ano1 ++;
            }



            if(dia1 == dia2 && mes1 == mes2 && ano1 == ano2){
                System.out.printf("Chegou na data %d/%d/%d!", dia1, mes1, ano1);
                contador ++;
            }
        }
    }
}
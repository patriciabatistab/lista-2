package org.example.domingues.davi;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o ponto a: ");
        String pontoA = input.nextLine();
        int[] coordenadasA = toCoordenadas(pontoA);

        System.out.println("Insira o ponto b: ");
        String pontoB = input.nextLine();
        int[] coordenadasB = toCoordenadas(pontoB);

        if (coordenadasA[0] == coordenadasB[0] && coordenadasA[1] == coordenadasB[1]) {
            System.out.println("Pontos coincidentes");
        } else if (coordenadasA[0] == coordenadasB[0]) {
            System.out.println("Pontos formam um reta horizontal");
        } else if (coordenadasA[1] == coordenadasB[1]) {
            System.out.println("Pontos formam um reta vertical");
        } else  {
            System.out.println("Pontos formam um retângulo");
            System.out.println("Área do retângulo: " + calcularArea(coordenadasA, coordenadasB));
        }


        System.out.println("Insira o ponto c: ");
        String pontoC = input.nextLine();
        int[] coordenadasC = toCoordenadas(pontoC);
    }

    static int[] toCoordenadas(String ponto) {
        ponto = ponto.replaceAll("[^\\d,-]", "");
        String[] coordenadasA = ponto.split(",");
        return new int[] {Integer.parseInt(coordenadasA[0]), Integer.parseInt(coordenadasA[1])};
    }

    static int calcularArea(int[] coordenadasA, int[] coordenadasB) {
        return Math.abs(coordenadasA[0] - coordenadasB[0]) * Math.abs(coordenadasA[1] - coordenadasB[1]);
    }
}

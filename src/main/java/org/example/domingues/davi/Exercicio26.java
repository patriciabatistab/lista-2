package org.example.domingues.davi;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro horário:");
        String horario1 = input.nextLine();
        String[] horarioSeparado1 = horario1.split(":");

        System.out.println("Segundo horário:");
        String horario2 = input.nextLine();
        String[] horarioSeparado2 = horario2.split(":");

        int segundos1 = toSegundos(horarioSeparado1);
        int segundos2 = toSegundos(horarioSeparado2);

        System.out.println("Diferença: " + Math.abs(segundos1 - segundos2));

    }

    static int toSegundos(String[] horario) {
        return (((Integer.parseInt(horario[0]) * 60) + Integer.parseInt(horario[1])) * 60);
    }
}

package org.example.patricia;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o horário (HH:MM:SS): ");
        String horario = scanner.nextLine();

        Pattern pattern = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher matcher = pattern.matcher(horario);

        if (matcher.matches()){
            System.out.println("Horário no formato adequado");
        } else {
            System.out.println("Horário no formato inadequado");
        }
    }
}

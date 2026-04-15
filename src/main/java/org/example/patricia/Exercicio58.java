package org.example.patricia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data(DD/MM/AAAA): ");
        String dataInput = scanner.nextLine();

        System.out.println("Digite a quantidade de dias que quer adicionar: ");
        long qtdDias = scanner.nextInt();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataInput, formato);

        System.out.println(data.plusDays(qtdDias).format(formato));
    }
}

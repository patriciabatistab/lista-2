package org.example.richard;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os os valores de X do primeiro retângulo:");
        int x1_r1 = scan.nextInt();
        int x2_r1 = scan.nextInt();
        int x3_r1 = scan.nextInt();
        int x4_r1 = scan.nextInt();

        double xMax_r1 = x1_r1;

        if (x2_r1 >= xMax_r1) xMax_r1 = x2_r1;
        if (x3_r1 >= xMax_r1) xMax_r1 = x3_r1;
        if (x4_r1 >= xMax_r1) xMax_r1 = x4_r1;

        double xMin_r1 = x1_r1;

        if (x2_r1 <= xMin_r1) xMin_r1 = x2_r1;
        if (x3_r1 <= xMin_r1) xMin_r1 = x3_r1;
        if (x4_r1 <= xMin_r1) xMin_r1 = x4_r1;

        System.out.println("Digite os valores de Y do primeiro retângulo:");
        int y1_r1 = scan.nextInt();
        int y2_r1 = scan.nextInt();
        int y3_r1 = scan.nextInt();
        int y4_r1 = scan.nextInt();

        double yMax_r1 = y1_r1;

        if (y2_r1 >= yMax_r1) yMax_r1 = y2_r1;
        if (y3_r1 >= yMax_r1) yMax_r1 = y3_r1;
        if (y4_r1 >= yMax_r1) yMax_r1 = y4_r1;

        double yMin_r1 = y1_r1;

        if (y2_r1 <= yMin_r1) yMin_r1 = y2_r1;
        if (y3_r1 <= yMin_r1) yMin_r1 = y3_r1;
        if (y4_r1 <= yMin_r1) yMin_r1 = y4_r1;

        System.out.println("x maior r1 " + xMax_r1);
        System.out.println("x menor r1 " + xMin_r1);
        System.out.println("y maior r1 " + yMax_r1);
        System.out.println("y menor r1 " + yMin_r1);

        System.out.println("Digite os os valores de X do segundo retângulo:");
        int x1_r2 = scan.nextInt();
        int x2_r2 = scan.nextInt();
        int x3_r2 = scan.nextInt();
        int x4_r2 = scan.nextInt();

        double xMax_r2 = x1_r2;

        if (x2_r2 >= xMax_r2) xMax_r2 = x2_r2;
        if (x3_r2 >= xMax_r2) xMax_r2 = x3_r2;
        if (x4_r2 >= xMax_r2) xMax_r2 = x4_r2;

        double xMin_r2 = x1_r2;

        if (x2_r2 <= xMin_r2) xMin_r2 = x2_r2;
        if (x3_r2 <= xMin_r2) xMin_r2 = x3_r2;
        if (x4_r2 <= xMin_r2) xMin_r2 = x4_r2;

        System.out.println("Digite os valores de Y do segundo retângulo:");
        int y1_r2 = scan.nextInt();
        int y2_r2 = scan.nextInt();
        int y3_r2 = scan.nextInt();
        int y4_r2 = scan.nextInt();

        double yMax_r2 = y1_r2;

        if (y2_r2 >= yMax_r2) yMax_r2 = y2_r2;
        if (y3_r2 >= yMax_r2) yMax_r2 = y3_r2;
        if (y4_r2 >= yMax_r2) yMax_r2 = y4_r2;

        double yMin_r2 = y1_r2;

        if (y2_r2 <= yMin_r2) yMin_r2 = y2_r2;
        if (y3_r2 <= yMin_r2) yMin_r2 = y3_r2;
        if (y4_r2 <= yMin_r2) yMin_r2 = y4_r2;

        if (xMax_r1 <= xMin_r1 || yMax_r1 <= yMin_r1) {
            System.out.println("O Retângulo 1 é inválido (linha ou um ponto).");
            return;
        }

        if (xMax_r2 <= xMin_r2 || yMax_r2 <= yMin_r2) {
            System.out.println("O Retângulo 2 é inválido (linha ou um ponto).");
            return;
        }

        System.out.println("x maior r2 " + xMax_r2);
        System.out.println("x menor r2 " + xMin_r2);
        System.out.println("y maior r2 " + yMax_r2);
        System.out.println("y menor r2 " + yMin_r2);

        boolean separadoHorizontalmente = (xMax_r1 < xMin_r2) || (xMax_r2 < xMin_r1);
        boolean separadoVerticalmente = (yMax_r1 < yMin_r2) || (yMax_r2 < yMin_r1);

        if (separadoHorizontalmente || separadoVerticalmente) {
            System.out.println("Os retângulos não se interceptam.");
        } else {
            System.out.println("Os retângulos se interceptam!");
        }
    }
}
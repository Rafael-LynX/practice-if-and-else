package com.rafael.pratices;

import java.util.Scanner;

public class Triangulo {
    int ladoA;
    int ladoB;
    int ladoC;

    Scanner scanner = new Scanner(System.in);
    public void triangulo() {
        System.out.println("Digite o valor do lado A: ");
        ladoA = scanner.nextInt();
        System.out.println("Digite o valor do lado B: ");
        ladoB = scanner.nextInt();
        System.out.println("Digite o valor do lado C: ");
        ladoC = scanner.nextInt();

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
    }
}

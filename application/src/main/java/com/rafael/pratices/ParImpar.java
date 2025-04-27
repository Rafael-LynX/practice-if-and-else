package com.rafael.pratices;

import java.util.Scanner;

public class ParImpar {
    int numero;
    String resultado;

    Scanner scanner = new Scanner(System.in); 
    public void parImpar() {
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O número " + numero + " é " + resultado);
    }
}

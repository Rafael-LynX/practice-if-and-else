package com.rafael.pratices;

import java.util.Scanner;

public class DoacaoSangue {
    int idade;
    double peso;

    Scanner scanner = new Scanner(System.in);

    public void doacao() {
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();


        if (idade >= 18 && idade <=65 && peso > 50) {
            System.out.println("Você pode doar sangue.");
        } else {
            if (idade < 18) {
                System.out.println("Você não pode doar sangue, pois é menor de idade.");
            } else if (idade > 65) {
                System.out.println("Você não pode doar sangue, pois é maior de 65 anos.");
            } else if (peso <= 50) {
                System.out.println("Você não pode doar sangue, pois seu peso é menor que 50kg.");
            }
        }
    }
}

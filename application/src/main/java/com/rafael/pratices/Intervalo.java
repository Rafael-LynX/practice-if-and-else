package com.rafael.pratices;

import java.util.Scanner;

public class Intervalo {
    int emprestimo = 1000/5000;
    int valor;

    Scanner scanner = new Scanner(System.in);
    public void intervalo() {
        System.out.println("Digite o valor do emprestimo: ");
        valor = scanner.nextInt();
        
        if(valor >= 1000 && valor <= 5000) {
            System.out.println("Valor do emprestimo: " + valor);
            System.out.println("Valor está dentro do intervalo permitido.");
        } else {
            System.out.println("Valor do emprestimo deve ser entre 1000 e 5000.");
        }
        
    }
}

package com.rafael.pratices;

import java.util.Scanner;

public class Desconto {
    double valorProduto;
    double descontoPercentual = 0.10; // 10% de desconto
    double resultado;
    
    Scanner scanner = new Scanner(System.in);
    public void calcularDesconto() {
        System.out.println("Digite o valor do produto: ");
        valorProduto = scanner.nextDouble();
        
        if (valorProduto >= 100.00) {
            resultado = valorProduto - (valorProduto * descontoPercentual);
            System.out.println("O valor do desconto é: " + resultado);
        } else {
            System.out.println("O valor do desconto é: " + valorProduto);
        }
    }
   
    
}

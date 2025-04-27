package com.rafael.pratices;

public class ComparandoNumeros {
    int numero1 = 30;
    int numero2 = 20;

    public void compararNumeros() {
        if (numero1 > numero2) {
            System.out.println("numero " + numero1 + " é maior que o número " + numero2 + ".");
        } else if (numero1 < numero2) {
            System.out.println("numero " + numero2 + " é maior que o número " + numero1 + ".");
        } else {
            System.out.println("os numeros são iguais. " + numero1 + " = " + numero2 + ".");
        }
    }
}

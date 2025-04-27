package com.rafael.pratices;

public class Aprovado {
    String nome;
    double nota1, nota2, media;
    String resultado;

    public void calcularMedia() {
        media = (nota1 + nota2) / 2;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media > 5 && media < 7) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
    }

    public void exibirResultado() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}

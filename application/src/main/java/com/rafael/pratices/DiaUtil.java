package com.rafael.pratices;

import java.util.Scanner;

public class DiaUtil {
    String dia;

    Scanner scanner = new Scanner(System.in);

    public void diaDeTrabalho() {
        System.out.println("Digite o dia da semana: ");
        dia = scanner.nextLine();
            if (dia.equals("segunda") || dia.equals("terça") || 
                dia.equals("quarta") || dia.equals("quinta") || 
                dia.equals("sexta")) {
                System.out.println("Dia útil, dia de trabalho!");
            } else if (dia.equals("sabado") || dia.equals("domingo")) {
                System.out.println("Dia de folga!");
            } else {
                System.out.println("Dia inválido!");
            }
        }
    }


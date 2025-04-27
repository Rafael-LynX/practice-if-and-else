package com.rafael.pratices;

import java.util.Scanner;

public class CodigoDeAcesso {
    int codigoAcesso;
    int nivelAcesso;

    Scanner scanner = new Scanner(System.in);

    public void validandoEntrada() {
        System.out.println("Digite o código de acesso: ");
        codigoAcesso = scanner.nextInt();
        System.out.println("Digite o nível de acesso: ");
        nivelAcesso = scanner.nextInt();

        if (codigoAcesso == 2023 && nivelAcesso == 1) {
            System.out.println("Acesso liberado!");
        } else if (codigoAcesso == 2023 && nivelAcesso == 2) {
            System.out.println("Acesso liberado!");
        } else if (codigoAcesso == 2023 && nivelAcesso == 3) {
            System.out.println("Acesso liberado!");
        } else {
            if (codigoAcesso != 2023) {
                System.out.println("Código de acesso inválido!");
            } else if (nivelAcesso != 1 && nivelAcesso != 2 && nivelAcesso != 3) {
                System.out.println("Nível de acesso inválido!");
                
            }
        }    
    }
}

package com.rafael.pratices;

public class ValidaSenha {
    int senha = 12345;

    public void validarSenha(int senhaInformada) {
        if (senhaInformada == senha) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}

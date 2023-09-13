package br.senai.sp.jandira.model;

import java.util.Scanner;

public abstract class Usuario {
    Scanner teclado = new Scanner(System.in);
    public String name;

    public void Cadastro(){
        System.out.println("---------------------------------------------");
        System.out.println("------------ CADASTRO DO USUÁRIO ------------");
        System.out.println("---------------------------------------------");
        System.out.println("Qual o seu nome?: ");
        name  = teclado.next();

    }
}

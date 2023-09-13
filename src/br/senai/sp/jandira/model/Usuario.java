package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Usuario {
    Usuario usuario = new Usuario();
    Scanner teclado = new Scanner(System.in);

    public String name;
    public String choice;

    public void Cadastro(){
        System.out.println("---------------------------------------------");
        System.out.println("------------ CADASTRO DO USUÁRIO ------------");
        System.out.println("---------------------------------------------");
        System.out.println("Qual o seu nome?: ");
        usuario.name  = teclado.next();
        System.out.println("-------------------------------------------");
        System.out.println("O que você deseja fazer?: [Listar Tarefas - Criar Tarefas - Editar Tarefas]");
        usuario.choice = teclado.next();

    }
}

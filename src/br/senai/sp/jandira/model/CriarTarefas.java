package br.senai.sp.jandira.model;

import java.util.Scanner;

public class CriarTarefas {

    Scanner teclado = new Scanner(System.in);

    EstadoTarefas estadotarefas = new EstadoTarefas();

    Tarefas tarefas = new Tarefas();

    public Object CriarTarefas(){
        System.out.println("*******************************");
        System.out.println("Você está criando uma tarefa. " );
        System.out.println("*******************************");

        System.out.println("Nome da tarefa: " );
        tarefas.nomedatarefa = teclado.next();
        System.out.println();

        System.out.println("Data de Vencimento (PRAZO FINAL): ");
        tarefas.data = teclado.next();
        System.out.println();

        System.out.println("Descrição da Tarefa: ");
        tarefas.descricao = teclado.next();
        System.out.println();

        return null;
    }

}

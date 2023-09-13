package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    public void Menu() {

        boolean repetir = true;
        while (repetir){

            System.out.println("----------------------------");
            System.out.println("Selecione a opcão desejada: ");
            System.out.println("----------------------------");
            System.out.println("01 - Criar Tarefas");
            System.out.println("02 - Listar Tarefas");
            System.out.println("03 - Editar Tarefas");
            teclado.next();

            int choice = teclado.nextInt();

            switch (choice) {

                case 1:
                    CriarTarefas criarTarefas = new CriarTarefas();
                    Tarefas tarefas = (Tarefas) criarTarefas.CriarTarefas();

                case 2:

                case 3:

            }



        }
    }
}

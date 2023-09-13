package br.senai.sp.jandira.model;

public class EstadoTarefas {
    public String Estado(int estado){
        String EstadoDaTarefa = null;

        switch (estado){

            case 1:
                EstadoDaTarefa = "Tarefa Concluída!!!";
                break;

            case 2:
                EstadoDaTarefa = " Tarefa Não Concluída...";
                break;
        }
        return EstadoDaTarefa;
    }

}




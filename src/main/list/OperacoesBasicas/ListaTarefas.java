package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    //metodo para adicionar uma tarefa
    public void adicionarTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //metodo para remover uma tarefa
    public void removerTarefas(String descricao){
        
    }
}

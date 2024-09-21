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
         List<Tarefa> TarefasParaRemover = new ArrayList<>();

         for(Tarefa t : tarefaList){
             if(t.getDescicao().equalsIgnoreCase(descricao)){
                 TarefasParaRemover.add(t);
             }
         }
         tarefaList.removeAll(TarefasParaRemover);
    }

    //retorna o número de tarefas na lista
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    //imprimindo as terafas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}

package main.list.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
   private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos ag = new AgendaContatos();

        ag.adicionarContato("Alexandre", 123456);
        ag.adicionarContato("Alexandre", 5665);
        ag.adicionarContato("Alexandre Liberato", 111111);
        ag.adicionarContato("Alexandre DIO", 65842);
        ag.adicionarContato("Alexandre Gonçalves", 444444);

        ag.exibirContato();

        ag.removerContato("Alexandre DIO");
        ag.exibirContato();
    }
}

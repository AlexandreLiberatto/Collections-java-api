package pesquisaEmList;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    public Set<Contato> contatoset;

    public AgendaContatos() {
        this.contatoset = new HashSet<>();
    }

    public void adicionaContato(String nome, int numero) {
        contatoset.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoset);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoset) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoset) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    // fazendo testes
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionaContato("Alexandre", 123456);
        agendaContatos.adicionaContato("Alexandre Liberato", 0);
        agendaContatos.adicionaContato("Alexandre DIO", 11111);
        agendaContatos.adicionaContato("Alexandre", 165842);
        agendaContatos.adicionaContato("Alexandre Silva", 885544);

        agendaContatos.exibirContatos();
    }
}

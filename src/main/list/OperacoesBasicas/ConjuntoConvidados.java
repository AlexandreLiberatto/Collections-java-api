package main.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    //método main para testar a aplicação
    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();
        System.out.println("Existem " + c.contarConvidados() + " convidados dentro de Set Convidados");

        c.adicionarConvidado("convidado 1", 1234);
        c.adicionarConvidado("convidado 2", 1235);
        c.adicionarConvidado("convidado 3", 1235);
        c.adicionarConvidado("convidado 4", 1236);

        System.out.println("Existem " + c.contarConvidados() + " convidados dentro de Set Convidados");

        c.removerConvidadoPorCodigoDoConvite(1234);

        System.out.println("Existem " + c.contarConvidados() + " convidados dentro de Set Convidados");

        c.exibirConvidados();
    }
}

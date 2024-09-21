package pesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //criando lista
    private List<Livro> livroList;

    //criando construtor e instanciando um arrayList vazio
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //adicionando livros
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //pesquisando por autor
    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosporAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosporAutor.add(l);
                }
            }
        }
        return livrosporAutor;
    }

    //pesquisa os livros por intervalo de anos
    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    //pesquisar livro por titulo
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}

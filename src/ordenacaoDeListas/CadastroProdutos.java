package ordenacaoDeListas;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15.0, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 12.0, 10);
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 20.0, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 25.0, 2);

        System.out.println("Produtos originais: " + cadastroProdutos.produtoSet);

        System.out.println("Produtos ordenados por nome: " + cadastroProdutos.exibirProdutoPorNome());

        System.out.println("Produtos ordenados por preço: " + cadastroProdutos.exibirProdutoPorPreco());
    }
}

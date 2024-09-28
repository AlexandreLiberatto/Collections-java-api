package main.list.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
           for (Produto p : estoqueProdutosMap.values()) {
               valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
              if (p.getPreco() > maiorPreco) {
                  produtoMaisCaro = p;

              }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos ep = new EstoqueProdutos();

        ep.exibirProdutos();

        ep.adicionarProduto(1L, "produto A", 5.0, 10);
        ep.adicionarProduto(2L, "produto B", 10.0, 5);
        ep.adicionarProduto(3L, "produto C", 15.0, 2);

        ep.exibirProdutos();
        System.out.println("Valor total do estoque: " + ep.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + ep.obterProdutoMaisCaro());
    }
}

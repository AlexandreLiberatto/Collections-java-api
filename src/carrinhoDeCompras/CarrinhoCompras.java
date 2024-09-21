package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Produto>  produtos;//lista que armazena os produtos no carrinho

    public CarrinhoCompras(){//contrutor: cria um novo carrinho de compras com a lista de proidutos vazia
        this.produtos = new ArrayList<>();//inicializa a lista de produtos
    }

    //motodo par adicionar produto no carrinho
    public void adicionarProduto(Produto produto){
        produtos.add(produto);// adiciona o produto a lista
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);//remove o produto da lista
    }

    //metodo para exibir os produtos no carrinho
    public void exibirCarrinho(){
        if(produtos.isEmpty()){//verifica se o carrinho está vazio
            System.out.println("O carrinho está vazio.");// mensagem se não ouver produto
        } else {
            System.out.println("produtos no Carrinho:");//mostra os produtos no carriho
            for(Produto produto : produtos){//para cada produto na lista, exibe-o
                System.out.println(produto);// usa o método toString() do Produto
            }
        }
    }

    //metodo para calcular o total de todos os produtos no carrinho
    public double calcularTotal(){
        double total = 0;//variavel para armazenar o total
        for(Produto produto : produtos){//para cada produto no carrinho
            total += produto.getPreco();//soma o preço de cada produto ao total
        }
        return total;//retorna o valor total dos produtos
    }
}




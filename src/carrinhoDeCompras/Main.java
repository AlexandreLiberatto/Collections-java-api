package carrinhoDeCompras;

public class Main {
    public static void main(String[] args) {

        //criando produtos
        Produto produto1 = new Produto("Camiseta", 49.90);
        Produto produto2 = new Produto("Calça", 79.90);
        Produto produto3 = new Produto("Tênis", 199.90);

        // Criando um novo carrinho de compras
        CarrinhoCompras carrinho = new CarrinhoCompras();

        //adicionando produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        //exibindo o conteudo do carrinho
        carrinho.exibirCarrinho();

        //exibindo o total do carrinho
        System.out.println("Total: R$: "+ carrinho.calcularTotal());

        //removendo produto do carrinho
        carrinho.removerProduto(produto1);

        //exibindo carrinho atualizado
        carrinho.exibirCarrinho();
        System.out.println("Total atualizado: R$: " + carrinho.calcularTotal());

    }
}

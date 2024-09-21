package carrinhoDeCompras;

public class Produto {
    private String nome; // Nome do produto
    private double preco; // Preço do produto

    // Construtor: usado para criar objetos da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome; // Inicializa o nome
        this.preco = preco; // Inicializa o preço
    }

    // Métodos 'getter': usados para acessar os atributos de forma segura
    public String getNome() {
        return nome; // Retorna o nome do produto
    }

    public double getPreco() {
        return preco; // Retorna o preço do produto
    }

    // Método toString: usado para exibir o produto como uma string
    @Override
    public String toString() {
        return nome + " - R$ " + preco; // Exibe o produto no formato "nome - R$ preço"
    }
}


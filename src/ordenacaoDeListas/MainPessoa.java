package ordenacaoDeListas;

public class MainPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        //adicionando pessoas
        ordenacaoPessoa.adicionarPessoas("Nome 1", 40, 1.56);
        ordenacaoPessoa.adicionarPessoas("Nome 2", 25, 1.72);
        ordenacaoPessoa.adicionarPessoas("Nome 3", 39, 1.64);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("\n============================\n");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

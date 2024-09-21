package pesquisaEmList;

public class MainLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        //adicionando livros
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2025);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println("\n==========================================\n");

        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(2020, 2025));
        System.out.println("\n==========================================\n");

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }
}

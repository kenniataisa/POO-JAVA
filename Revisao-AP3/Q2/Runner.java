import java.util.ArrayList;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        SistemaDeGerenciamentoBiblioteca sistema = new SistemaDeGerenciamentoBiblioteca();

        // Criando livros
        Livro livro1 = new Livro("J.K. Rowling", "Harry Potter e o Prisioneiro de Azkaban", 1997, Set.of("Fantasia"));
        Livro livro2 = new Livro("J.K. Rowling", "Harry Potter e a Caçada dos 7 Espíritos", 1998, Set.of("Fantasia"));
        Livro livro3 = new Livro("J.K. Rowling", "Harry Potter e o Cálice de Fogo", 2000, Set.of("Fantasia"));

        // Cadastrando livros
        sistema.cadastrarLivro(livro1);
        sistema.cadastrarLivro(livro2);
        sistema.cadastrarLivro(livro3);

        // Criando e cadastrando seções e bibliotecários
        SecaoDaBiblioteca secaoRomance = new SecaoDaBiblioteca("Romance", Set.of("Fantasia"), new ArrayList<>(), null);
        Bibliotecario bibliotecario1 = new Bibliotecario("Joaquim", secaoRomance);
        secaoRomance.setBibliotecarioResponsavel(bibliotecario1);

        sistema.cadastrarSecao(secaoRomance);
        sistema.cadastroBibliotecario(bibliotecario1);

        try {
            secaoRomance.adicionarLivro(livro1);
            secaoRomance.adicionarLivro(livro2);
            secaoRomance.adicionarLivro(livro3);
        } catch (LivroIncompativelException e) {
            System.out.println(e.getMessage());
        }

        // Organizando eventos corretamente
        bibliotecario1.organizarEventosDeLeitura();

        // Buscando livros por categoria
        sistema.listarLivrosPorCategoria("Fantasia");

        // Consultando bibliotecários por seção
        sistema.listarBibliotecariosPorSecao("Romance");

        // Listando seções por categoria
        sistema.listarSecaoPorCategoria("Fantasia");
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SistemaDeGerenciamentoBiblioteca implements Gerenciamento<Livro> {
    List<SecaoDaBiblioteca> secoesBibliotecas;
    List<Bibliotecario> bibliotecarios;
    List<Livro> livros;

    public SistemaDeGerenciamentoBiblioteca() {
        this.secoesBibliotecas = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
        this.livros = new ArrayList<>();
    }

    public List<SecaoDaBiblioteca> getSecoesBibliotecas() {
        return secoesBibliotecas;
    }

    public List<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " Cadastrado");
    }

    public void cadastroBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
        System.out.println("Bibliotecario " + bibliotecario.getNome() + " Cadastrado");

    }

    public void cadastrarSecao(SecaoDaBiblioteca secaoBiblioteca){
        this.secoesBibliotecas.add(secaoBiblioteca);
        System.out.println("Secao " + secaoBiblioteca.getNome() + " Cadastrada");
    }

    public void listarLivrosPorCategoria(String categoria) {
        System.out.println("Livro na categoria " + categoria + ":");
        for (Livro livro : livros) {
            if (livro.getCategorias().contains(categoria)) {
                System.out.println(livro);
            }
        }
    }

    public void listarBibliotecariosPorSecao(String secao) {
        System.out.println("Bibliotecarios na seção " + secao + ":");
        for (SecaoDaBiblioteca secaoBiblioteca : secoesBibliotecas) {
            if (secaoBiblioteca.getNome().equals(secao)) {
                System.out.println(secaoBiblioteca.getBibliotecarioResponsavel().getNome());
            }
        }
    }

    public void listarSecaoPorCategoria(String categoria) {
        System.out.println("Secao na categoria " + categoria + ":");
        for (SecaoDaBiblioteca secaoBiblioteca : secoesBibliotecas) {
            if (secaoBiblioteca.getCategoriasAceitas().contains(categoria)) {
                System.out.println(secaoBiblioteca.getNome());
            }
        }
    }

    @Override
    public void adicionarLivro(Livro livro) throws LivroIncompativelException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarLivro'");
    }

    @Override
    public void removerLivro(Livro livro) throws NoSuchElementException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerLivro'");
    }

    @Override
    public Livro buscarLivroPorTitulo(String titulo) throws NoSuchElementException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarLivroPorTitulo'");
    }

}

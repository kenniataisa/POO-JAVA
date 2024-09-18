import java.util.NoSuchElementException;

public interface Gerenciamento<T> {
    void adicionarLivro(T livro) throws LivroIncompativelException;
    void removerLivro(T livro) throws NoSuchElementException;
    T buscarLivroPorTitulo(String titulo) throws NoSuchElementException;
}

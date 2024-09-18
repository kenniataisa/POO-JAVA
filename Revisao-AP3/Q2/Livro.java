import java.util.Set;

public class Livro {
    private String autor;
    private String titulo;
    private int anoPublicacao;
    private Set<String> categorias;

    public Livro(){

    }

    public Livro(String autor, String titulo, int anoPublicacao, Set<String> categorias) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.categorias = categorias;
    }

    public String getAutor() {
        return autor;
    }   

    public String getTitulo() {
        return titulo;
    }       

    public int getAnoPublicacao() {
        return anoPublicacao;
    }   

    public Set<String> getCategorias() {
        return categorias;
    }           

    public String toString() {
        return "Livro{" + "autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + ", categorias=" + categorias + '}';
    }

}

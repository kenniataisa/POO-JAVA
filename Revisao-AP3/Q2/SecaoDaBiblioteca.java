import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class SecaoDaBiblioteca {
    private String nome;
    private Set<String> categoriasAceitas;
    private List<Livro> livros = new ArrayList<>(); 
    private Bibliotecario bibliotecarioResponsavel;

    public SecaoDaBiblioteca(String nome, Set<String> categoriasAceitas, List<Livro> livros, Bibliotecario bibliotecarioResponsavel) {
        this.nome = nome;
        this.categoriasAceitas = categoriasAceitas;
        this.livros = livros;
        this.bibliotecarioResponsavel = bibliotecarioResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Set<String> getCategoriasAceitas() {
        return categoriasAceitas;
    }

    public Bibliotecario getBibliotecarioResponsavel() {
        return bibliotecarioResponsavel;
    }


    public void adicionarLivro(Livro livro) throws LivroIncompativelException {
        boolean categoriaCompativel = false;
        for(String categoria : livro.getCategorias()){
            if(categoriasAceitas.contains(categoria)){
                categoriaCompativel = true;
                break;
            }
        }

        if(categoriaCompativel){
            livros.add(livro);
            System.out.println("Livro " + livro.getTitulo() + " adicionado na seção " + this.getNome());
        }else{
            throw new LivroIncompativelException("Catregoria do Livro incompatível");
    }


    }

    public void removerLivro(Livro livro) throws NoSuchElementException{
        if(!livros.remove(livro)){
            throw new NoSuchElementException("Livro Nao Encontrado");
        }

        System.out.println("Livro " + livro.getTitulo() + " removido da seção " + this.getNome());
    }

    public void setBibliotecarioResponsavel(Bibliotecario bibliotecario) {
        this.bibliotecarioResponsavel = bibliotecario;
    }
    





     
}
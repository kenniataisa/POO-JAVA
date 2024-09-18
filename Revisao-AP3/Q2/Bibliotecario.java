import java.util.NoSuchElementException;
import java.util.Random;

public class Bibliotecario{
    private String nome;
    private SecaoDaBiblioteca secaoResponsavel;

    public Bibliotecario(String nome, SecaoDaBiblioteca secaoResponsavel) {
        this.nome = nome;
        this.secaoResponsavel = secaoResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public SecaoDaBiblioteca getSecaoResponsavel() {
        return secaoResponsavel;
    }

   public void adicionarLivro(Livro livro){
        try {
            secaoResponsavel.adicionarLivro(livro);
        } catch (LivroIncompativelException e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerLivro(Livro livro) {
        try {
            secaoResponsavel.removerLivro(livro);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

   
    public void buscarLivroPorTitulo(String titulo) {
        System.out.println("Livro na secao " + secaoResponsavel.getNome());

        for(Livro livro : secaoResponsavel.getLivros()){
            if(livro.getTitulo().equals(titulo)){
                System.out.println("Livro encontrado: " + livro.toString() + "na secão " + secaoResponsavel.getNome());
            }
        }
        
    }
    public void organizarEventosDeLeitura() {
        if (secaoResponsavel.getBibliotecarioResponsavel() != null) {
            Random random = new Random();
            int diaDoEvento = random.nextInt(30) + 1;
            int mesDoEvento = random.nextInt(12) + 1;
            System.out.println("Dia do evento: " + diaDoEvento + "/" + mesDoEvento  
                + "\n" + "Organizador: " + secaoResponsavel.getBibliotecarioResponsavel().getNome() + "\n");
        } else {
            System.out.println("Nenhum bibliotecário definido.");
        }
    }
    
}
import java.util.List;

public class Veiculo {
    private String nome;
    private String anoDeFabricacao;
    private List<String> categorias;

    public Veiculo(String nome, String anoDeFabricacao, List<String> categorias) {
        this.nome = nome;
        this.anoDeFabricacao = anoDeFabricacao;
        this.categorias = categorias;
    }

    public String getNome() {
        return nome;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }   

   public List<String> getCategorias() {
        return categorias;
   } 

   @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", anoDeFabricacao=" + anoDeFabricacao + ", categorias=" + categorias + "]";
}
}
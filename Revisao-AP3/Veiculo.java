public abstract class Veiculo {
    private String nome;
    private String anoDeFabricacao;
    private String  categoria;

    public Veiculo(String nome, String anoDeFabricacao, String categoria) {
        this.nome = nome;
        this.anoDeFabricacao = anoDeFabricacao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }   

    public String getCategoria() {
        return categoria;
    }   

    public abstract void exibirDetalhes();

    
}

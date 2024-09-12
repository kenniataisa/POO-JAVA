public class ProdutoAVenda{
    private String nome;
    private Integer estoque;
    private Double preco;


    public ProdutoAVenda(String nome, Integer estoque, Double preco) {
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Integer getEstoque() {
        return this.estoque;
    }


    public Double getPreco() {
        return this.preco;
    }

    public Double getValorDoEstoque(){
        if(estoque != null && this.preco != null){
            return preco * estoque;
        }

        return 0.0;

    }

    public Boolean removerEstoque(){

        if(this.estoque > 0){
            this.estoque--;
            return true;
            
        }

        return false;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void adicionarEstoque(){
        this.estoque+=11;

    }
}
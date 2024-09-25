public class Veiculo implements Comparable<Veiculo>{

    private String nome;
    private int anoDeFabricacao;

    public Veiculo(String nome, int anoDeFabricacao){
        this.nome = nome;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getNome(){
        return nome;
    }   

    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }

    @Override
    public int compareTo(Veiculo outroVeiculo){
        return Integer.compare(this.anoDeFabricacao, outroVeiculo.anoDeFabricacao);
    }

    
    @Override
    public String toString(){
       return nome + " - " + anoDeFabricacao;
    }


    
}
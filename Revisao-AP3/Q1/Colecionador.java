import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colecionador <T extends Veiculo, U> {
    private String nome;
    List<T> garagem;
    List<U> condecoracoes;

    public Colecionador(String nome) {
        this.nome = nome;
        this.garagem = new ArrayList<>();
        this.condecoracoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<T> getGaragem() {
        return garagem;
    }

    public List<U> getCondecoracoes() {
        return condecoracoes;
    }   

    public void adicionarVeiculo(T veiculo) throws VeiculoJaExisteException { 
        if(garagem.contains(veiculo)) {
            throw new VeiculoJaExisteException("Veiculo já existe na garagem");
        }

        garagem.add(veiculo);
        System.out.println("Veiculo " + veiculo.getNome() + " adicionado a garagem");

    }


    public void removerVeiculo(T veiculo) throws VeiculoNaoEncontradoException {
        if(!garagem.contains(veiculo)) {
            throw new VeiculoNaoEncontradoException("Veiculo não encontrado na garagem");
        }

        garagem.remove(veiculo);
        System.out.println("Veiculo " + veiculo.getNome() + " removido da garagem");
}

    public void organizarGaragem() {
        Collections.sort(garagem, new Comparator<T> (){
            @Override
            public int compare(T v1, T v2) {
                return v1.getAnoDeFabricacao().compareTo(v2.getAnoDeFabricacao());
            }
        });

        System.out.println("Garagem de" + nome + " organizada por ano de fabricação");
        for(T veiculo : garagem) {
            veiculo.exibirDetalhes();
        }
    }

    public void adicionarCondecoracao(U condecoracao) {
        condecoracoes.add(condecoracao);
    }

    @Override
    public String toString() {  
        return "Colecionador [nome=" + nome + ", garagem=" + garagem + ", condecoracoes=" + condecoracoes + "]";            
}

}
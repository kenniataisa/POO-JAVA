import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Colecionador <T extends Veiculo> {
    private String nome;
    List<T> garagem;

    public Colecionador(String nome) {
        this.nome = nome;
        this.garagem = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<T> getGaragem() {
        return garagem;
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
}


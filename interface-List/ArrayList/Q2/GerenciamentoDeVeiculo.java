import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeVeiculo {
    private List<Veiculo> listaDeVeiculos;
    
    public GerenciamentoDeVeiculo() {
        this.listaDeVeiculos = new ArrayList<>();
    }
    
    public void adicionarVeiculo(Veiculo veiculo) {
        this.listaDeVeiculos.add(veiculo);
        System.out.println("Veiculo adicionado com sucesso!");
    }

    public void removerVeiculo(String nome) throws VeiculoNaoEncontradoException {
        boolean veiculoRemovido = false;
        for(Veiculo v : this.listaDeVeiculos) {
            if(v.getNome().equalsIgnoreCase(nome)) {
                this.listaDeVeiculos.remove(v);
                System.out.println("Veiculo removido com sucesso!");
                break;

            }
        }

        if(!veiculoRemovido) {
            throw new VeiculoNaoEncontradoException("Veiculo com nome " + nome + " nao encontrado");
        }

        
    }

    public void exibirVeiculos() {
        if(this.listaDeVeiculos.isEmpty()) {
            System.out.println("Nenhum veiculo encontrado");
        } else {
            System.out.println("Veiculos encontrados: ");
            for(Veiculo v : this.listaDeVeiculos) {
                System.out.println(v.toString());
            }
        }
    }

    public void buscarVeiculo(String nome) throws VeiculoNaoEncontradoException {
        boolean veiculoEncontrado = false;
        for(Veiculo v : this.listaDeVeiculos) {
            if(v.getNome().equalsIgnoreCase(nome)) {
                System.out.println(v.toString());
                veiculoEncontrado = true;
                break;
            }
        }
        if(!veiculoEncontrado) {
            throw new VeiculoNaoEncontradoException("Veiculo com nome " + nome + " nao encontrado");
        }
    }
    
}
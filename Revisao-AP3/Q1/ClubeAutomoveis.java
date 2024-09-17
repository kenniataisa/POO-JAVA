import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClubeAutomoveis < T extends Colecionador > {
    private String nome;
    private Colecionador<T, String> lider;
    private List<String> categoriasAceitas;
    private Set<Colecionador<T, String>> membros;

    public ClubeAutomoveis(String nome, Colecionador <T, String> lider, List<String> categoriasAceitas) {
        this.nome = nome;
        this.lider = lider;
        this.membros = new HashSet<>();
        this.categoriasAceitas = categoriasAceitas;
    }   

    public String getNome() {
        return nome;
    }

    public Colecionador<T, String> getLider() {
        return lider;
    }   

    public void aceitarVeiculo(T veiculo){
        return categoriasAceitas.contains(veiculo.getCategorias());
    }

    public void adicionarMembro(Colecionador<T, String> colecionador) {
        membros.add(colecionador);
    }

    public void organizarCompeticao(Colecionador<T, String> colecionador1, Colecionador<T, String> colecionador2) {
        if(!membros.contains(colecionador1) && !membros.contains(colecionador2)) {
            throw new ColecionadorNaoEncontradoException("Colecionadores não encontrados");
        }

        System.out.println("Competição organizada entre " + colecionador1.getNome() + " e " + colecionador2.getNome());
        Colecionador<T, String> vencedor = colecionador1;
        vencedor.adicionarCondecoracao("Vencedor da competição " + nome);
        System.out.println("Vencedor da competição: " + vencedor.getNome()); 

        }

}
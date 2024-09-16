import java.util.HashSet;
import java.util.Set;

public class ClubeAutomoveis {
    private String nome;
    private Set<Colecionador<?>> colecionadores;

    public ClubeAutomoveis(String nome) {
        this.nome = nome;
        this.colecionadores = new HashSet<>();
    }   


    public String getNome() {
        return nome;
    }   

    public void adicionarColecionador(Colecionador<?> colecionador) {
        colecionadores.add(colecionador);
        System.out.println("Colecionador " + colecionador.getNome() + " adicionado ao clube");
    }

    public void organizarCompeticao() {
        System.out.println("Competição organizada pelo clube" + nome);
        for(Colecionador<?> colecionador : colecionadores) {
            System.out.println("Colecionador: " + colecionador.getNome()+ "com garagem de" + colecionador.getGaragem().size() + "veiculos");

        }


    }
    
}

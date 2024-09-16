import java.util.List;
import java.util.ArrayList;
public class Contato implements Comparable<Contato> {
    private String nome;
    List<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<Telefone>();
    }

    public String getNome() {
        return nome;
    }

    public int compareTo(Contato c) {
        return this.nome.compareTo(c.nome);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String identificador, String numero) {
        this.telefones.add(new Telefone(identificador, numero));
    }
    public String mostrarTelefones() {
        StringBuilder sb = new StringBuilder();
        for(Telefone t : this.telefones) {
            sb.append(t.toString()).append("\n");
        }
          return sb.toString();    
    
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" + "Telefones: \n" + this.mostrarTelefones();
    }
}
    


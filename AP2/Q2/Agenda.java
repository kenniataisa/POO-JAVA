import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        for(Contato c : this.contatos) {
            if(c.getNome().equals(contato.getNome())) {
                throw new IllegalArgumentException("Contato com o nome duplicado");	
            }
    }
        
            if(contato.getTelefones().isEmpty()) {
                throw new IllegalArgumentException("Contato deve ter pelo menos um telefone.");
        }

        this.contatos.add(contato);
    } 

    public void removerContato(String idNUmero) {
       for(Contato contato : this.contatos) {
        for(Telefone telefone : contato.getTelefones()) {
            if(telefone.getIdentificador().equals(idNUmero)) {
                this.contatos.remove(contato);
                System.out.println("Contato removido com sucesso");
                return;
            }
        }
    }
    System.out.println("Contato com id '" + idNUmero + "' não encontrado");

    }
    public void mostrarContatos(){
        Collections.sort(this.contatos);
        for(Contato c : this.contatos) {
            System.out.println(c.toString());
        }
    }

}
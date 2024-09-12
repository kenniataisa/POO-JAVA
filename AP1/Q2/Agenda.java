import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public Boolean adicionar(Contato contatos){
        for(Contato c : this.contatos){
            if(c.getNome() == contatos.getNome()){
                return false;
            }
        }

        return this.contatos.add(contatos);


    }

    public String getTelefone(String nome) {
        Contato contato = this.buscar(nome);
            return (contatos != null) ? contato.getTelefone() : "Não existe";
    }   

    public Integer getTotalContatos() {
        return this.contatos.size();

    }

    public Contato buscar(String nome){
        for(Contato c : this.contatos){
            if(c.getNome() == nome){
               return c;
            }
        }

        return null;
    }
    
}

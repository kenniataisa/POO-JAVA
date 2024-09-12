import java.util.ArrayList;

public class MinhasFinancas {
    private String nome;
    private ArrayList<Lancamento> lancamentos;

    public MinhasFinancas(String nome) {
        this.nome = nome;
        this.lancamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public boolean adicionarReceita(String desc, Double valor){
        if(desc == null || desc.isEmpty() || valor <= 0.0){
            return false;
        }

        Lancamento lancamento = new Lancamento(desc, valor,true);
        this.lancamentos.add(lancamento);
        return true;
    }

    public boolean adicionarDespesa(String desc, Double valor){
        if(desc == null || desc.isEmpty() || valor <= 0.0){
            return false;
        }

        Lancamento lancamento = new Lancamento(desc, valor,false);
        this.lancamentos.add(lancamento);
        return true;
    }

    public Double getTotalReceitas(){
        double total = 0.0;
        for(Lancamento l : this.lancamentos){
            if(l.getTipo()){
                total+=l.getValor();
            }
        }
        return total;
    }

    public Double getTotalDespesas(){
        double total = 0.0;
        for(Lancamento l : this.lancamentos){
            if(!l.getTipo()){
                total+=l.getValor();
            }
        }
        return total;
    }

   public Double getSaldoGeral(){
       return this.getTotalReceitas() - this.getTotalDespesas();
   } 


}

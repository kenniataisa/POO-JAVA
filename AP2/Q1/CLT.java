public class CLT extends Funcionario {
    private double salario;
    private double valeRefeicao = 0.006;

    public CLT(String nome, String cpf, double salario, double auxilioSaude, double valeRefeicao) {
        super(nome, cpf, auxilioSaude);
        this.salario = salario;
        this.valeRefeicao = 0.006;
    }

    public double getValeRefeicao() {
        return valeRefeicao * getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public double calculoSalario() {
        if(getSalario() < 1320.00) {
            throw new IllegalArgumentException("O salário deve ser maior que R$ 1.320,00");
        }
        return getSalario() + getAuxilioSaude() + getValeRefeicao();
    }

    @Override
    public String toString() {  
        return String.format("Nome: %s\nCPF: %s\nAuxilio Saude: R$ %.2f\nVale Refeicao: R$ %.2f\nSalario: R$ %.2f", getNome(), getCpf(),
                getAuxilioSaude(), getValeRefeicao(), calculoSalario());
    }


}

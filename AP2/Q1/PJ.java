public class PJ extends Funcionario {
    private String cnpj;
    private double salario;

    public PJ(String nome, String cpf, String cnpj, double salario, double auxilioSaude) {
        super(nome, cpf, auxilioSaude);
        this.cnpj = cnpj;
        this.salario = salario;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double calculoSalario() {
        return salario + getAuxilioSaude();

    }

    @Override
    public String toString() {
        return String.format("\nNome: %s\nCPF: %s\nCNPJ: %s\nAuxilio Saude: R$ %.2f\nSalario: R$ %.2f", getNome(), getCpf(),
                cnpj, getAuxilioSaude(), calculoSalario());
    }

}

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double auxilioSaude;

    public Funcionario(String nome, String cpf, double auxilioSaude) {
        this.nome = nome;
        this.cpf = cpf;
        this.auxilioSaude = 600.00;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getAuxilioSaude() {
        return auxilioSaude;
    }

    public abstract double calculoSalario();


    public String toString() {
        return String.format("Nome: %s\nCPF: %s\nAuxilio Saude: R$ %.2f\nSalario: R$ %.2f", nome, cpf, auxilioSaude,
                calculoSalario());

    }

}
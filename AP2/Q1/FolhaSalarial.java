import java.util.ArrayList;
import java.util.List;

public class FolhaSalarial {
    private List<Funcionario> funcionarios;

    public FolhaSalarial() {
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f) {
        if (f == null) {
            throw new IllegalArgumentException("Funcionário inválido");
        }
        this.funcionarios.add(f);
    }

    public void gerarExtrato() {
        for (Funcionario f : this.funcionarios) {
            System.out.println(f.toString());
        }

    }

    public double valorTotalFolhaSalarial() {
        double total = 0.0;
        for (Funcionario f : this.funcionarios) {
            total += f.calculoSalario();
        }
        return total;
    }

    public double valorTotalBeneficios() {
        double total = 0.0;
        for (Funcionario f : this.funcionarios) {
            if (f instanceof CLT) {
                CLT clt = (CLT) f;
                total += clt.getAuxilioSaude() + clt.getValeRefeicao();
            } else {
                if (f instanceof PJ) {
                    PJ pj = (PJ) f;
                    total += pj.getAuxilioSaude();
                }
            }
        }
        
        return total;

    }
}
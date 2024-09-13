public class RunnerAP2Q1 {

    public static void main(String[] args) {

        try {
            FolhaSalarial folha = new FolhaSalarial();

            CLT funcionario1 = new CLT("Joao", "123.456.789-00", 2500.00, 500.00, 0.6);
            PJ funcionario2 = new PJ("Maria", "987.654.321-00", "123.456.789/0001-00", 5000.00, 500.00);

            folha.addFuncionario(funcionario1);
            folha.addFuncionario(funcionario2);

            folha.gerarExtrato();
            System.out.println("\n===========================================\n");
            System.out.println("Valor total da folha salarial: R$" + folha.valorTotalFolhaSalarial());
            System.out.println("Valor total de beneficios: R$" + folha.valorTotalBeneficios());
            System.out.println("");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
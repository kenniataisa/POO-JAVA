public class Runner {
    public static void main(String[] args) {

        GerenciamentoDeVeiculo gerenciamentoDeVeiculo = new GerenciamentoDeVeiculo();

        gerenciamentoDeVeiculo.adicionarVeiculo(new Veiculo("Gol", 2020));
        gerenciamentoDeVeiculo.adicionarVeiculo(new Veiculo("Fiat Uno", 2021));
        gerenciamentoDeVeiculo.adicionarVeiculo(new Veiculo("Fusca", 2022));

        gerenciamentoDeVeiculo.exibirVeiculos();

        try{
            gerenciamentoDeVeiculo.buscarVeiculo("Corolla");
        }catch(VeiculoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

        try{
            gerenciamentoDeVeiculo.removerVeiculo("Gol");
        }catch(VeiculoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

        gerenciamentoDeVeiculo.exibirVeiculos();
        

    }
    
}

public class CarroClassico extends Veiculo{
    public CarroClassico(String nome, String anoDeFabricacao) {
        super(nome, anoDeFabricacao, "Carro Classico");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        System.out.println("Categoria: " + getCategoria());
}
}
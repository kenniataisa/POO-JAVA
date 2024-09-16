public class CarroEsportivo extends Veiculo {
    public CarroEsportivo(String nome, String anoDeFabricacao) {
        super(nome, anoDeFabricacao, "Carro Esportivo");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());   
        System.out.println("Ano de Fabricação: " + getAnoDeFabricacao());
        System.out.println("Categoria: " + getCategoria());
    }

    
}

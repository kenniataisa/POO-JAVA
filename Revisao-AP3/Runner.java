public class Runner {
    public static void main(String[] args) {
        try{

            Veiculo carroClassico = new CarroClassico("Celta", "2019");
            Veiculo carroEsportivo = new CarroEsportivo("Corolla", "2018");
        

            ColecionadorEsportivo colecionador1 = new ColecionadorEsportivo("Marcos");
            ColecionadorClassico colecionador2 = new ColecionadorClassico("Maria");

            colecionador1.adicionarVeiculo(carroClassico);
            colecionador2.adicionarVeiculo(carroEsportivo);

            ClubeAutomoveis clube = new ClubeAutomoveis("Clube Automoveis");
            clube.adicionarColecionador(colecionador1);
            clube.adicionarColecionador(colecionador2);

            clube.organizarGaragem();


          }catch(VeiculoJaExisteException | VeiculoNaoEncontradoException e){
            System.out.println(e.getMessage());
          }


}

}
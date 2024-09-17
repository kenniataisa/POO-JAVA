public class Runner {
    public static void main(String[] args) {
        try{

            Veiculo veiculo1 = new Veiculo("Camaro", "2010", List.of("esportivo", "suv"));
            Veiculo veiculo2 = new Veiculo("Camaro", "2010", List.of("esportivo", "suv"));

            Colecionador< Veiculo, String> colecionador1 = new Colecionador<>("Colecionador1");
            Colecionador< Veiculo, String> colecionador2 = new Colecionador<>("Colecionador2");

            colecionador1.adicionarVeiculo(veiculo1);
            colecionador2.adicionarVeiculo(veiculo2);

            ClubeAutomoveis< Veiculo > clube = new ClubeAutomoveis<>("ClubeAutomoveis", colecionador1, List.of("esportivo", "suv"));
            clube.adicionarMembro(colecionador1);
            clube.adicionarMembros(colecionador2);

            clube.organizarCompeticao(colecionador1, colecionador2);


          
          }catch(VeiculoJaExisteException e){
            System.out.println(e.getMessage());
          }


}

}
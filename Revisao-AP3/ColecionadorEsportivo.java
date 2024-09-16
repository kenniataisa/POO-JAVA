public class ColecionadorEsportivo extends Colecionador<CarroClassico> {
    public ColecionadorEsportivo(String nome) {
        super(nome);
    }

   @Override
   public void organizarGaragem() {
       System.out.println("Garagem de" + getNome() + " organizada por ano de fabricação");
   } 
    
}

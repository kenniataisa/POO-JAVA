public class ColecionadorClassico extends Colecionador<CarroClassico> {
    public ColecionadorClassico(String nome) {
        super(nome);
    }

    @Override
    public void organizarGaragem() {
        System.out.println("Garagem de" + getNome() + " organizada por ano de fabricação");
    }
    
}

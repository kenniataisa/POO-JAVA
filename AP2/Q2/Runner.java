public class Runner {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        try {
            Contato contato1 = new Contato("Fulano");
            contato1.adicionarTelefone("casa", "88 99999-8888");
            contato1.adicionarTelefone("celular", "99999-8888");

            Contato contato2 = new Contato("Beltrano");
            contato2.adicionarTelefone("casa", "87 99999-7777");

            agenda.adicionarContato(contato1);
            agenda.adicionarContato(contato2);

            agenda.mostrarContatos();

            agenda.removerContato("234");

            agenda.mostrarContatos();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

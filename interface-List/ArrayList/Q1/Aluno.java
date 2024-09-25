import java.util.ArrayList;
import java.util.Collections; // Importando Collections para ordenar
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private List<String> alunos = new ArrayList<>();

    public Aluno() {}

    public List<String> getNomes() {
        return alunos;
    }

    public void adicionarAluno(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Nome não pode ser nulo");
        }
        alunos.add(nome);
        System.out.println("Aluno adicionado: " + nome);
        System.out.println(alunos);
    }

    public void buscarAluno(String nome) throws Exception {
        int posicao = alunos.indexOf(nome);
        if (posicao >= 0) {
            System.out.println("Aluno encontrado: " + nome + "\n" + "Posição: " + posicao);
        } else {
            throw new Exception("Aluno não encontrado: " + nome);
        }
    }

    public void removerAluno(int posicao) throws Exception {
        if (posicao < 0 || posicao >= alunos.size()) {
            throw new Exception("Posição inválida");
        }
        alunos.remove(posicao);
        System.out.println("Aluno removido da lista");
    }

    public void exibirAlunos() {
        System.out.println("Lista de Alunos Ordenada:");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i + ": " + alunos.get(i));
        }
    }

    public static void main(String[] args) {
        Aluno alunos = new Aluno();
        Scanner sc = new Scanner(System.in);

        try {
            alunos.adicionarAluno("Joaquim");
            alunos.adicionarAluno("Ana");
            alunos.adicionarAluno("Matheus");
            alunos.adicionarAluno("Lucas");
            alunos.adicionarAluno("Pedro");

            // Ordenar a lista de alunos
            Collections.sort(alunos.getNomes());
            alunos.exibirAlunos();

            // Buscar Aluno
            System.out.println("Digite o nome do aluno que deseja buscar:");
            String nome = sc.nextLine();
            alunos.buscarAluno(nome);

            // Remover Aluno
            System.out.println("Digite a posição do aluno que deseja remover:");
            int posicaoRemover = sc.nextInt() - 1;
            alunos.removerAluno(posicaoRemover);

            // Ordenar novamente após a remoção
            Collections.sort(alunos.getNomes());
            
            // Exibir lista atualizada
            alunos.exibirAlunos();

            sc.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

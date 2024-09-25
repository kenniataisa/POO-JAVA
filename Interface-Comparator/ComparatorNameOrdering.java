import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorNameOrdering {
    private List<String> nomes;

    // Construtor
    public ComparatorNameOrdering() {
        this.nomes = new ArrayList<>();
    }

    // Retorna a lista de nomes
    public List<String> getNomes() {
        return this.nomes;
    }

    // Definição do Comparator
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String palavra1, String palavra2) {
            if (palavra1.length() > palavra2.length()) {
                return 1;
            } else if (palavra1.length() < palavra2.length()) {
                return -1;
            } else {
                return palavra1.compareTo(palavra2); // Ordem alfabética se os tamanhos forem iguais
            }
        }
    };

    // Método para ordenar os nomes
    public void ordenarNomes() {
        Collections.sort(this.nomes, comparator); // Ordena a lista de nomes
    }

    public static void main(String[] args) {
        // Cria uma instância da classe
        ComparatorNameOrdering orderingNames = new ComparatorNameOrdering();

        // Adiciona nomes à lista
        orderingNames.getNomes().add("Joaquim");
        orderingNames.getNomes().add("Ana");
        orderingNames.getNomes().add("Matheus");

        // Ordena os nomes
        orderingNames.ordenarNomes();

        // Exibe os nomes ordenados
        for (String nome : orderingNames.getNomes()) {
            System.out.println(nome);
        }
    }
}

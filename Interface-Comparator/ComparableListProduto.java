import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparableListProduto implements Comparable <ComparableListProduto>{

    private String nome;
    private double preco;
    private int quantidade;

    public ComparableListProduto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }   

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    @Override
    public int compareTo(ComparableListProduto precoProduto) {
        return Double.compare(this.preco, precoProduto.preco);
        
    }
    
    @Override
    public String toString() {
        return this.nome + ", " + this.preco + ", " + this.quantidade;
    }

    public static void main(String[] args) {
        List<ComparableListProduto> produtos = new ArrayList<>();
        System.out.println("");
        produtos.add(new ComparableListProduto("Drone", 200.00, 1));
        produtos.add(new ComparableListProduto("TV", 900.00, 1));
        produtos.add(new ComparableListProduto("Notebook", 1200.00, 1));
        produtos.add(new ComparableListProduto("Tablet", 400.00, 1));

        Collections.sort(produtos);
        for (ComparableListProduto p : produtos) {
            System.out.println(p);
        }


    }
}

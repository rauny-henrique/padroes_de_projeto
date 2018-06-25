package PadroesGRASP.Expert;

public class ItemVenda {

    private String nome;
    private double preco_unitario;
    private int quantidade;

    public ItemVenda(String nome, double preco_unitario, int quantidade) {
        this.nome = nome;
        this.preco_unitario = preco_unitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

}

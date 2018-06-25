package PadroesGRASP.Creator;

public class PedidoItem {

    private String nome;
    private double precoUnitario;
    private int quantidade;

    public PedidoItem(Produto produto){
        this.nome = produto.getNome();
        this.precoUnitario = produto.getPreco();
        this.quantidade = 1;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

}

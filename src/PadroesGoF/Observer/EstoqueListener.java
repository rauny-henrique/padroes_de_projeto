package PadroesGoF.Observer;

public interface EstoqueListener extends java.util.EventListener {

    void updatePreco(double precoProduto1, double precoProduto2);

}

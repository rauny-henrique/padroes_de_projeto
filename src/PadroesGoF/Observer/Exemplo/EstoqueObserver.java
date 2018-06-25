package PadroesGoF.Observer.Exemplo;

public class EstoqueObserver implements EstoqueListener {

    private double precoProduto1;
    private double precoProduto2;

    private static int observerIDTracker = 0;
    private int observerID;

    private Subject estoqueSubject;

    public EstoqueObserver(Subject estoqueSubject) {

        this.estoqueSubject = estoqueSubject;
        this.observerID = observerIDTracker++;

        estoqueSubject.register(this);
        System.out.println("Novo observer registrado com ID: " + observerID);

    }

    @Override
    public void updatePreco(double precoProduto1, double precoProduto2) {

        this.precoProduto1 = precoProduto1;
        this.precoProduto2 = precoProduto2;

        System.out.println("ID do observer: " + observerID + "\nProduto1: " + precoProduto1 + "\nProduto2: " + precoProduto2+ "\n");

    }

    public int getObserverID() {
        return observerID;
    }

}

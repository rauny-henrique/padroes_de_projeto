package PadroesGoF.Observer.Exemplo;

import java.util.ArrayList;

public class Estoque implements Subject {

    private ArrayList<EstoqueListener> observers;

    private double precoProduto1;
    private double precoProduto2;

    public Estoque() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(EstoqueListener novoObserver) {
        observers.add(novoObserver);
    }

    @Override
    public void unregister(EstoqueListener removerObserver) {

        int observerIndex = observers.indexOf(removerObserver);

        System.out.println("EstoqueListener deletado!");

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for (EstoqueListener observer: observers){

            observer.updatePreco(precoProduto1, precoProduto2);

        }

    }

    public void setPrecoProduto1(double precoProduto1) {
        this.precoProduto1 = precoProduto1;
        notifyObserver();
    }

    public void setPrecoProduto2(double precoProduto2) {
        this.precoProduto2 = precoProduto2;
        notifyObserver();
    }

    public ArrayList<EstoqueListener> getObservers() {
        return observers;
    }

}

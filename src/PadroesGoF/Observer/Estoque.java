package PadroesGoF.Observer;

import java.util.ArrayList;

public class Estoque implements Subject {

    private ArrayList<Observer> observers;

    private double precoProduto1;
    private double precoProduto2;

    public Estoque() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer novoObserver) {
        observers.add(novoObserver);
    }

    @Override
    public void unregister(Observer removerObserver) {

        int observerIndex = observers.indexOf(removerObserver);

        System.out.println("Observer deletado!");

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for (Observer observer: observers){

            observer.update(precoProduto1, precoProduto2);

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

    public ArrayList<Observer> getObservers() {
        return observers;
    }

}

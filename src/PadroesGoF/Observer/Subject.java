package PadroesGoF.Observer;

public interface Subject {

    void register(EstoqueListener observer);
    void unregister(EstoqueListener observer);
    void notifyObserver();

}

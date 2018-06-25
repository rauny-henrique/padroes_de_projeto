package PadroesGoF.Observer.Exemplo;

import PadroesGoF.Observer.Exemplo.EstoqueListener;

public interface Subject {

    void register(EstoqueListener observer);
    void unregister(EstoqueListener observer);
    void notifyObserver();

}

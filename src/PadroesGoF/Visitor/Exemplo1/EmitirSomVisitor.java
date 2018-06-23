package PadroesGoF.Visitor.Exemplo1;

import PadroesGoF.Visitor.Exemplo1.Visitor;

//EmitirSomVisitor é uma operação comum as duas classes (Cachorro e Gato)
//Nome da classe: Nome da operação + Visitor
public class EmitirSomVisitor implements Visitor {

    @Override
    public void visita(Cachorro cachorro) {
        System.out.println("O cachorro faz: " + cachorro.getSom());
    }

    @Override
    public void visita(Gato gato) {
        System.out.println("O gato faz: " + gato.getSom());
    }

}

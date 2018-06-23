package PadroesGoF.Visitor.Exemplo1;

public class Programa {

    public static void main(String[] args) {

        //Operação
        EmitirSomVisitor emitirSom = new EmitirSomVisitor();

        Gato gato = new Gato();
        gato.aceitaVisita(emitirSom);

        Cachorro cachorro = new Cachorro();
        cachorro.aceitaVisita(emitirSom);

    }

}

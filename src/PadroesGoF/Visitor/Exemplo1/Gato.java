package PadroesGoF.Visitor.Exemplo1;

public class Gato implements Visitable {

    private String som = "Miau miau";

    public String getSom() {
        return som;
    }

    @Override
    public void aceitaVisita(Visitor visitor) {
        visitor.visita(this);
    }

}

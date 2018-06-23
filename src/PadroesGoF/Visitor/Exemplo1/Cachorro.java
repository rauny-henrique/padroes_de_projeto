package PadroesGoF.Visitor.Exemplo1;

public class Cachorro implements Visitable {

    private String som = "Au au";

    public String getSom() {
        return som;
    }

    @Override
    public void aceitaVisita(Visitor visitor) {
        visitor.visita(this);
    }

}

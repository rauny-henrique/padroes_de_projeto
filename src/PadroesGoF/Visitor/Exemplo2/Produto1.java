package PadroesGoF.Visitor.Exemplo2;

public class Produto1 implements Visitable {

    private Double valor;

    public Produto1(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public double aceitaVisita(Visitor visitor) {
        return visitor.visita(this);
    }

}

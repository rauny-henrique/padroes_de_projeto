package PadroesGoF.FactoryMethod;

public abstract class EspacoNave {

    private String nome;
    private double poder_de_fogo;
    private double velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPoder_de_fogo() {
        return poder_de_fogo;
    }

    public void setPoder_de_fogo(double poder_de_fogo) {
        this.poder_de_fogo = poder_de_fogo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

}

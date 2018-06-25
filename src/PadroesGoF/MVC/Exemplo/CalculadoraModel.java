package PadroesGoF.MVC.Exemplo;

public class CalculadoraModel {

    private int resultado;

    public void soma(int a, int b) {
        resultado = a + b;
    }

    public int getResultado() {
        return resultado;
    }

}

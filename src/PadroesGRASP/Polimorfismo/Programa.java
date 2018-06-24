package PadroesGRASP.Polimorfismo;

public class Programa {

    public static void main(String[] args) {

        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();

        System.out.println("Soma = " + soma.calcular(1, 6));

        System.out.println("Subtração = " + subtracao.calcular(2, 4));

    }

}

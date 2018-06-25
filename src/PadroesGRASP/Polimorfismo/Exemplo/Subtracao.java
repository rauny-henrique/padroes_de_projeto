package PadroesGRASP.Polimorfismo.Exemplo;

import PadroesGRASP.Polimorfismo.Exemplo.OperacaoMatematica;

public class Subtracao extends OperacaoMatematica {

    @Override
    double calcular(double x, double y) {
        return x - y;
    }

}

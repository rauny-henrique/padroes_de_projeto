package PadroesGoF.Visitor.Exemplo2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

//EmitirSomVisitor é uma operação comum as duas classes (Produto1 e Produto2)
//Nome da classe: Nome da operação + Visitor
public class CalculaTaxaVisitor implements Visitor {

    private DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(new Locale("en", "")));

    @Override
    public double visita(Produto1 produto1) {
        System.out.println("Calculando taxa do produto 1...");
        return Double.valueOf(df.format(produto1.getValor() * 0.22 ));
    }

    @Override
    public double visita(Produto2 produto2) {
        System.out.println("Calculando taxa do produto 2...");
        return Double.valueOf(df.format(produto2.getValor() * 0.35 ));
    }

}

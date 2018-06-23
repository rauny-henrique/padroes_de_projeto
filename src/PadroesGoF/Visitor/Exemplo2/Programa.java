package PadroesGoF.Visitor.Exemplo2;

public class Programa {

    public static void main(String[] args) {

        //Operação
        CalculaTaxaVisitor calculaTaxa = new CalculaTaxaVisitor();

        Produto1 produto1 = new Produto1(10.50);
        Double valorTaxaProduto1 = produto1.aceitaVisita(calculaTaxa);
        System.out.println("Taxa do produto1 = " + valorTaxaProduto1);

        Produto2 produto2 = new Produto2(15.30);
        Double valorTaxaProduto2 = produto2.aceitaVisita(calculaTaxa);
        System.out.println("Taxa do produto2 = " + valorTaxaProduto2);

    }

}

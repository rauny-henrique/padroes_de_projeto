package PadroesGoF.Observer;

public class Programa {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        EstoqueObserver estoqueObserver1 = new EstoqueObserver(estoque);

        estoque.setPrecoProduto1(20.50);
        estoque.setPrecoProduto2(12.30);

        EstoqueObserver estoqueObserver2 = new EstoqueObserver(estoque);

        estoque.setPrecoProduto1(20.50);
        estoque.setPrecoProduto2(12.30);

        System.out.println("Observer registrados: " + estoque.getObservers() + "\n");

        estoque.unregister(estoqueObserver1);
        estoque.unregister(estoqueObserver2);

        System.out.println("\nObserver registrados: " + estoque.getObservers());

    }

}

package PadroesGRASP.Expert.Exemplo;

public class Programa {

    public static void main(String args[]) {

        Venda venda = new Venda();

        ItemVenda item1 = new ItemVenda("Maça", 1, 10);
        ItemVenda item2 = new ItemVenda("Pêra", 2, 10);
        ItemVenda item3 = new ItemVenda("Goiaba", 2.50, 10);

        venda.addItem(item1);
        venda.addItem(item2);
        venda.addItem(item3);

        System.out.println("Total da venda: " + venda.getTotal());

    }

}

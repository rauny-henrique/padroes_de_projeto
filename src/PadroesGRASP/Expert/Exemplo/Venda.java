package PadroesGRASP.Expert.Exemplo;

import PadroesGRASP.Expert.Exemplo.ItemVenda;

import java.util.ArrayList;

public class Venda {

    private ArrayList<ItemVenda> itens;
    private double total;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void addItem(ItemVenda item) {
        this.total += (item.getPreco_unitario() * item.getQuantidade());
        this.itens.add(item);
    }

    public double getTotal() {
        return total;
    }
}

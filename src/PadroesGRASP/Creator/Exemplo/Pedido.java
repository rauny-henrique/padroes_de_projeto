package PadroesGRASP.Creator.Exemplo;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<PedidoItem> itens;

    public Pedido() {
        this.itens = new ArrayList();
    }

    public void criarNovoPedidoItem(Produto produto) {
        //Criamos a instancia de pedido item
        PedidoItem pedidoItem = new PedidoItem(produto);
        this.itens.add(pedidoItem);
    }

    public ArrayList<PedidoItem> getItens() {
        return itens;
    }

}

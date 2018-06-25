package PadroesGRASP.Creator.Exemplo;

public class Programa {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Produto produto1 = new Produto("Jaca", 20);
        Produto produto2 = new Produto("Maça", 2);
        Produto produto3 = new Produto("Melancia", 15);

        pedido.criarNovoPedidoItem(produto1);
        pedido.criarNovoPedidoItem(produto2);
        pedido.criarNovoPedidoItem(produto3);

        System.out.println("Itens do pedido:");
        for (PedidoItem item : pedido.getItens()) {
            System.out.println(item.getNome() + " - R$ " + item.getPrecoUnitario());
        }

    }

}

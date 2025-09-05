package restaurantes;

public class Restaurantes {

    public static void main(String[] args) {
        Prato prato1 = new Prato("Pizza", 40.0);
        Prato prato2 = new Prato("Lasanha", 35.0);
        Prato prato3 = new Prato("Refrigerante", 7.0);

        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        mesa2.reservar();

        Pedido pedido1 = new Pedido(mesa1);
        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato3);

        Pedido pedido2 = new Pedido(mesa2);
        pedido2.adicionarPrato(prato2);
        pedido2.adicionarPrato(prato3);

        mesa1.listarPedidos();
        System.out.println("Total da mesa 1: R$" + pedido1.calcularTotal());

        mesa2.listarPedidos();
        System.out.println("Total da mesa 2: R$" + pedido2.calcularTotal());

        System.out.println("A mesa 2 está reservada? " + mesa2.isReservada());
    }
}

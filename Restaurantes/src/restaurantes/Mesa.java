
package restaurantes;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private boolean reservada;
    private List<Pedido> pedidos = new ArrayList<>();

    public Mesa(int numero) {
        this.numero = numero;
        this.reservada = false;
    }

    public int getNumero() { return numero; }

    public boolean isReservada() { return reservada; }

    public void reservar() { reservada = true; }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        System.out.println("Pedidos da mesa " + numero + ":");
        pedidos.forEach((p) -> {
            System.out.println("- " + p);
        });
    }
}

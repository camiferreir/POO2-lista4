
package restaurantes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
     private final Mesa mesa;
    private final List<Prato> pratos = new ArrayList<>();

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        mesa.adicionarPedido(this);
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        total = pratos.stream().map((p) -> p.getPreco()).reduce(total, (accumulator, _item) -> accumulator + _item);
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido da mesa " + mesa.getNumero() + ": ");
        pratos.forEach((p) -> {
            sb.append(p.getNome()).append(", ");
         });
        sb.append("Total = R$").append(calcularTotal());
        return sb.toString();
    }
}


package carros;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
     private final String nome;
    private final List<Carro> carrosVendidos = new ArrayList<>();

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public void adicionarCarro(Carro c) {
        if (!c.isVendido()) {
         } else {
            carrosVendidos.add(c);
         }
    }

    public void listarCarrosVendidos() {
        System.out.println("Carros vendidos por " + nome + ":");
        carrosVendidos.forEach((c) -> {
            System.out.println("- " + c.getModelo());
         });
    }
}

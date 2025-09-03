
package estoquee;

import java.util.Arrays;
import java.util.List;

public class Estoquee {
 public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 5, 20.0);
        Produto p2 = new Produto("Feijão", 2, 8.0);

        Fornecedor f1 = new Fornecedor("Fornecedor A");

     Pedido pedido = new Pedido(f1, p1, 10);

        List<Produto> estoque = Arrays.asList(p1, p2);

        System.out.println("Produtos em estoque:");
        estoque.stream().map((p) -> {
            System.out.println(p);
         return p;
     }).filter((p) -> (p.getQuantidade() < 3)).forEachOrdered((p) -> {
         System.out.println("⚠ Estoque baixo de: " + p.getNome());
     });
    }
}

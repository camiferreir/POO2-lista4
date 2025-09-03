
package carros;

public class Carros {

    public static void main(String[] args) {
Marca m1 = new Marca("Toyota");
        Marca m2 = new Marca("Honda");

        Vendedor v1 = new Vendedor("Pedro");
        Vendedor v2 = new Vendedor("Lucas");

        Carro c1 = new Carro("Corolla", 120000, m1, v1);
        Carro c2 = new Carro("Civic", 110000, m2, v2);
        Carro c3 = new Carro("Yaris", 90000, m1, v1);

        c1.vender();
        v1.adicionarCarro(c1);

        System.out.println("Média de preço Toyota: " + m1.mediaPreco());
        System.out.println("Média de preço Honda: " + m2.mediaPreco());

        v1.listarCarrosVendidos();
    }
}
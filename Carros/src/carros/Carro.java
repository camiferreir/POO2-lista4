
package carros;

public class Carro {
      private final String modelo;
    private final double preco;
    private final Marca marca;
    private final Vendedor vendedor;
    private boolean vendido;

    public Carro(String modelo, double preco, Marca marca, Vendedor vendedor) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.vendedor = vendedor;
        this.vendido = false;
        marca.adicionarCarro(this);
        vendedor.adicionarCarro(this);
    }

    public String getModelo() { return modelo; }
    public double getPreco() { return preco; }
    public Vendedor getVendedor() { return vendedor; }

    public void vender() { vendido = true; }

    public boolean isVendido() { return vendido; }

    @Override
    public String toString() {
        return modelo + " | R$" + preco + " | Marca: " + marca.getNome() + (vendido ? " (Vendido)" : "");
    }
   
    }

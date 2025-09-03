package estoquee;

public class Produto {
  private final String nome;
    private int quantidade;
    private final double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public void adicionarEstoque(int qtd) { this.quantidade += qtd; }
    public void retirarEstoque(int qtd) { this.quantidade -= qtd; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return nome + " - Qtd: " + quantidade + " - R$" + preco;
    }
}

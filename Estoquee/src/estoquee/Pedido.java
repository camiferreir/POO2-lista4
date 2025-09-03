package estoquee;

public class Pedido {
 private final Fornecedor fornecedor;
    private final Produto produto;
    private final int quantidade;

    public Pedido(Fornecedor fornecedor, Produto produto, int quantidade) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
        produto.adicionarEstoque(quantidade);
    }

    @Override
    public String toString() {
        return "Pedido de " + quantidade + "x " + produto.getNome() +
               " ao fornecedor " + fornecedor.getNome();
    }
}


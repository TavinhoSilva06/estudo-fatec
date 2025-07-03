package exercicio01;

import java.util.List;

public class GestorProdutos {
    private List<Produto> produtos;

    public GestorProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade() * produto.getPreco();
        }
        return total;
    }
}

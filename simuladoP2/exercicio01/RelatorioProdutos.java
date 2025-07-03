package exercicio01;

import java.util.List;

public class RelatorioProdutos {
    public void exibirRelatorio(List<Produto> produtos) {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
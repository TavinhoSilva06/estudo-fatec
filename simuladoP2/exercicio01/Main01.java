package exercicio01;

import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		String arquivoCSV = "produtos.csv";

        LeitorCSV leitorCSV = new LeitorCSV();
        List<Produto> listaProdutos = leitorCSV.lerProdutos(arquivoCSV);

        GestorProdutos gestor = new GestorProdutos(listaProdutos);
        RelatorioProdutos relatorio = new RelatorioProdutos();

        relatorio.exibirRelatorio(gestor.getProdutos());

        System.out.println("\nValor total do estoque: R$ " + String.format("%.2f", gestor.calcularValorTotalEstoque()));
	}

}

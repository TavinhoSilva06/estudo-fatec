package exercicio01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
    public List<Produto> lerProdutos(String arquivoCSV) {
        List<Produto> produtos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            br.readLine(); 
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);
                produtos.add(new Produto(nome, quantidade, preco));
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }

        return produtos;
    }
}
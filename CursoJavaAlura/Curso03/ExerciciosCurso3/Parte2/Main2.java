package ExerciciosCurso3.Parte2;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Produto> ListaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Bolacha Bauducco", 7.50, 100);
//        produto1.setNome("Bolacha Bauducco");
//        produto1.setPreco(7.50);
//        produto1.setQuantidade(100);

        Produto produto2 = new Produto("Sofa", 600, 10);
//        produto2.setNome("Sofa");
//        produto2.setPreco(600);
//        produto2.setQuantidade(10);

        Produto produto3 = new Produto("Smart TV LG", 2500.50, 5);
//        produto3.setNome("Smart TV LG");
//        produto3.setPreco(2500.50);
//        produto3.setQuantidade(5);

        ListaProduto.add(produto1);
        ListaProduto.add(produto2);
        ListaProduto.add(produto3);

        System.out.println(ListaProduto.toString());

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Sorvete kibom", 16.50, 500, "Fabricação: 10/07/2025 || Validade: 25/03/2028");
        System.out.println(perecivel.toString());
        perecivel.ExibirData();

    }
}

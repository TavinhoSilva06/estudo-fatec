package ExerciciosCurso3.Parte3.exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        ArrayList<Produto> ListaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Ferrari", 5000.50);
        Produto produto2 = new Produto("Audi", 1000.99);
        Produto produto3 = new Produto("McLaren", 3000.25);

        ListaProduto.add(produto1);
        ListaProduto.add(produto2);
        ListaProduto.add(produto3);

        for (Produto prdt : ListaProduto) {
            System.out.println("Produto: " + prdt.getNome() + " || Preço: " + prdt.getPreco());
        }

        double SomaDosPrecos = 0;
        for (Produto produto : ListaProduto) {
            SomaDosPrecos = SomaDosPrecos + produto.getPreco();
        }

        double media = SomaDosPrecos / ListaProduto.size();
        System.out.println("Preço médio dos produtos: " +  media);
    }
}

package ExerciciosCurso2.Parte2.exercicio03;

public class Main3 {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Bolacha Bauducco");
        meuProduto.setPreco(7.50);

        System.out.println("Produto: " + meuProduto.getNome() + "\n" + "Preço: " + meuProduto.getPreco());
        meuProduto.AplicarDesconto();
    }
}

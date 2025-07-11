package ExerciciosCurso3.Parte2;

public class ProdutoPerecivel extends Produto{
    private String DataValidade;

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String DataValidade) {
        super(nome, preco, quantidade);
        this.DataValidade = DataValidade;
    }


    public void ExibirData() {
        System.out.println(DataValidade);
    }
}

package ExerciciosCurso2.Parte3.exercicio01;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setNomeCarro("Ford");
        meuCarro.setModelo("SUV");
        meuCarro.setPrecoAno1(36000);
        meuCarro.setPrecoAno2(50000);
        meuCarro.setPrecoAno3(100000);

        ModeloCarro tipo = new ModeloCarro();

        tipo.setPotencia(350);
        tipo.setKmRodados(20000);
        tipo.setConsumo(6.0);

        meuCarro.ExibirDetalhes();
        tipo.ExibirDetalhes();
    }
}

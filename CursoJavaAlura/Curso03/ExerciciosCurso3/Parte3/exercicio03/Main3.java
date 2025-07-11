package ExerciciosCurso3.Parte3.exercicio03;

public class Main3 {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();

        if (meuAnimal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) meuAnimal;
            System.out.println("O objeto é um cachorro");
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
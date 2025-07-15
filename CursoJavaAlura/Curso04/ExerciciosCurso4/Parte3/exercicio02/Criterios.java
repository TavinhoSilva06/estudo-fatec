package ExerciciosCurso4.Parte3.exercicio02;

public class Criterios {
    private String senha;

    public Criterios(String senha) throws SenhaInvalidaException {
        this.senha = senha;

        if(senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve obter mais de 8 caracteres");
        }
    }
}

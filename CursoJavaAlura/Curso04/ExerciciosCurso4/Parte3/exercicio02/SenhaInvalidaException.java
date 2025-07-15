package ExerciciosCurso4.Parte3.exercicio02;

public class SenhaInvalidaException extends Throwable {
        private String mensagem;

        public SenhaInvalidaException(String mensagem) {
            this.mensagem = mensagem;
        }

        @Override
        public String getMessage() {
            return this.mensagem;
        }
    }


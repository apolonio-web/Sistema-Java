public class main {
    public static void main(String[] args) {
        Treino treino1 = new Treino(
            "Pliometria",
            "melhorar a impulsão",
            30,
            true
        );

        treino1.mostrarTreino();

        if (treino1.treinoAtivo()){
            System.out.println("O treino está ativo.");
        }

        treino1.finalizarTreino();

        if(!treino1.treinoAtivo()){
            System.out.println("O treino não está ativo.");
        }
        }
    }
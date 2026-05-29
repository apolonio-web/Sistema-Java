public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();

        jogador1.nome = "Apolo";
        jogador1.posicao = "Atacante";
        jogador1.impulso = 10;
        jogador1.energia = 100;

        jogador1.mostrarDados();

        Treino treino1 = new Treino();
        
        treino1.nomeTreino = "Treino de impulso";
        treino1.ganhoImpulso = 20;
        treino1.gastoEnergia = 20;
        treino1.aplicarTreino(jogador1);

        jogador1.mostrarDados();
    }
}
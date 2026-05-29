public class Treino {
       String nomeTreino;
       int ganhoImpulso;
       int gastoEnergia;

       public void aplicarTreino(Jogador jogador){
        if(jogador.energia >= gastoEnergia){
            jogador.impulso += ganhoImpulso;
            jogador.energia -= gastoEnergia;
        }
        else{
            System.out.println("Energia insuficiente");
        }
       }
       
}
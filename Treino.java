public class Treino {
       String nomeTreino = "Pliometria";
       String objetivo = "melhorar a impulsão";
       int duracao = 30;
       boolean ativo = true;
       
    public Treino(String nomeTreino, String objetivo, int duracaoEmMinutos, boolean ativo){
        
        this.nomeTreino = nomeTreino;
        this.objetivo = objetivo;
        this.duracao = duracaoEmMinutos;
        this.ativo = ativo;
    }
    public void mostrarTreino(){
       System.out.println("Treino: " + nomeTreino);
       System.out.println("Objetivo: " + objetivo);
       System.out.println("Duração: " + duracao + " minutos");
       System.out.println("Status: " + ativo);
    }
    public boolean treinoAtivo(){
        return ativo;
        }   
    public void finalizarTreino(){
        System.out.println("Treino finalizado.");
        ativo = false;
    }
}
 



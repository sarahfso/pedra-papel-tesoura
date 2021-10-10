import java.util.Scanner;

public class Interface {
    public String PedirJogada(){
        Scanner palpite = new Scanner(System.in);
        
        System.out.println("Instruções: Escreva \"pedra\", \"papel\" ou \"tesoura\" para dar o lance.");
        System.out.print("Jogador: ");

        String palpiteDoJogador = palpite.next();
        String possibilidades[] = {"pedra","papel","tesoura"};
        
        while(!contains(palpiteDoJogador,possibilidades)){
            System.out.println("Não entendi! Tente novamente...");
            System.out.print("Jogador: ");
            palpiteDoJogador = palpite.next();
        } 
        
        return palpiteDoJogador; 
    }

    public void quemGanhou(String ganhador){
        switch(ganhador){
            case "jogador":
                System.out.println("Você ganhou!");
                break;
            case "computador":
                System.out.println("Você perdeu!");
                break;
            case "empate":
                System.out.println("Empate!");
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }

    public void mostrarPlacar(ControladorPlacarDeJogo placar){
        System.out.println("Jogador " + placar.vitoriasDoJogador + " x " + placar.vitoriasDoComputador + " CPU");
    }

    public boolean EncerrarJogo(){
        Scanner continuar = new Scanner(System.in);

        System.out.println("Deseja continuar? [s] ou [n]");
        
        String escolheu = continuar.next();
        String possibilidades[] = {"s","n"};

        while(!contains(escolheu,possibilidades)){
            System.out.println("Não entendi! Tente novamente...");
            System.out.println("Deseja continuar? [s] ou [n]");
            escolheu = continuar.next();
        } 

        String sim = "s";

        if(escolheu.equals(sim)) return false;
        return true;
    }

    public boolean contains(String item, String[] lista){
    
        for (String string : lista) {
            if(item.equals(string)) return true;
        }

        return false;
    }
}
public class PedraPapelTesoura implements Jogo {

  @Override
  public String resultado(String jogador, String computador) {
    if(jogador.equals(computador)){
      return "empate";
    }else{
      switch(jogador){
        case "pedra":
          if(computador=="papel"){
            return "computador";
          }else{
            return "jogador";
          }
        case "papel":
          if(computador=="tesoura"){
            return "computador";
          }else{
            return "jogador";
          }
        case "tesoura":
          if(computador=="pedra"){
            return "computador";
          }else{
            return "jogador";
          }
        default:
          return "erro";
      }
    }
  }
  public static void main(String args[]) throws InterruptedException {
    boolean encerrar;

    System.out.println("Bem-vindo :: Vamos jogar!");
    Interface tela = new Interface();
    String palpiteDoJogador, palpiteDoComputador, ganhador;
    String palpites[] = {"pedra","papel","tesoura"};
    PedraPapelTesoura jogo = new PedraPapelTesoura();
    ControladorPlacarDeJogo placar = new ControladorPlacarDeJogo();

    do{
      palpiteDoJogador = tela.PedirJogada();

      int index = (int)(Math.random()*3);
      palpiteDoComputador = palpites[index];
      Thread.sleep(1000);  
      System.out.println("CPU: " + palpiteDoComputador);

      ganhador = jogo.resultado(palpiteDoJogador, palpiteDoComputador);
      Thread.sleep(1000);
      tela.quemGanhou(ganhador);

      placar.atualizarPlacar(ganhador);
      Thread.sleep(1000);
      tela.mostrarPlacar(placar);

      Thread.sleep(1000);
      encerrar = tela.EncerrarJogo();
      if(encerrar) System.exit(0);
    }while(true);
  }
}


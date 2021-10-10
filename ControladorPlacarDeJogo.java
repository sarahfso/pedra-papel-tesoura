public class ControladorPlacarDeJogo {
    int vitoriasDoJogador;
    int vitoriasDoComputador;

    ControladorPlacarDeJogo(){
        this.vitoriasDoJogador = 0;
        this.vitoriasDoComputador = 0;
    }

    public void atualizarPlacar(String ganhador){
        if(ganhador=="jogador") vitoriasDoJogador++;
        if(ganhador=="computador") vitoriasDoComputador++;
    }

    public int getVitoriasDoJogador() {
        return vitoriasDoJogador;
    }

    public int getVitoriasDoComputador() {
        return vitoriasDoComputador;
    }

    public void setVitoriasDoJogador(int vitoriasDoJogador) {
        this.vitoriasDoJogador = vitoriasDoJogador;
    }

    public void setVitoriasDoComputador(int vitoriasDoComputador) {
        this.vitoriasDoComputador = vitoriasDoComputador;
    }
}

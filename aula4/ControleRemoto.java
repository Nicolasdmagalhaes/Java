package aula4;
// 0. Construção da classe
public class ControleRemoto {

    // 1.Atributos
    private boolean ligado;
    private int volume;
    private int canal;

    // 2.Construtores
    public ControleRemoto(){
        this.ligado = false;
        this.volume = 10;
    }
    public ControleRemoto(boolean ligado, int volume){
        this.ligado = ligado;
        this.volume = volume;
    }

    // 3. Getters e Setters

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume >=0 && volume <=100){
        this.volume = volume;
        System.out.println("Volume alterado: " + volume);
    }else{
            System.out.println("Volume inválido");
        }
    }
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(canal >=0 && canal <=300){
            this.canal = canal;
            System.out.println("Canal alterado: " + canal);
        }else{
            System.out.println("Canal inválido");
        }
    }

    // 4. Métodos Operacionais - Lógica Condicional
    // metodo ligar e desligar a tv

    public void ligarDesligar(){
        this.ligado = !this.ligado;
        if(this.ligado) {
            System.out.println("Tv Ligada!");
        }else{
            System.out.println("Tv Desligada!");
        }
    }
    //Aumentar o volume (+1)
    public void aumentarVolume() {
        if (!this.ligado) {
            System.out.println("Erro a TV está desligada!");
        } else if (this.volume >= 100) {
            System.out.println("Volume máximo (100)");
        } else {
            //this.volume = this.volume +1; ou this.volume ++;
            this.volume++;
        }
    }
    //Diminuir a tv (-1)
    public void diminuirVolume(){
        if (!this.ligado) {
            System.out.println("Erro a TV está desligada!");
        } else if (this.volume <= 0) {
            System.out.println("Volume no minimo(0)");
        } else {
            this.volume--;
        }
    }
    // Mudar canal da tv (+1)
    public void subirCanal() {
        if (!this.ligado) {
            System.out.println("Erro a TV está desligada!");
        } else if (this.canal >= 300) {
            System.out.println("Canal (300)");
        } else {
            this.canal++;
        }
    }
    public void descercanal(){
        if (!this.ligado) {
            System.out.println("Erro a TV está desligada!");
        } else if (this.canal <= 0) {
            System.out.println("Canal (0)");
        } else {
            this.canal--;
        }
    }
}

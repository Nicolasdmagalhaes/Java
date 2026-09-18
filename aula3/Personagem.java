package aula3;

public class Personagem {

    //Atributos da classe
     private String nome;
     private int nivel;
     private int vida;

    //Construtores

    //Contrutudor Padrão (default)
    public Personagem(){
        this.nome = "Novato";
        this.nivel = 1;
        this.vida = 100;
    }

    //Construtor Parametrizado
    public Personagem(String nome, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        // (O nivvel * 50) é uma regra de valor
        this.vida = nivel * 50;
    }

    //Getters and setters
    /*
    Gerar getters and setters de forma automática Mac e Windows
    -No windows clicar com o botão direito do mouse
    -Control + botão direito do mouse
    -Generat-> getters and setters
    -selecione todos e clique em generate
    * */

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;}

    public int getNivel() {return nivel;}

    public void setNivel(int nivel) {
        this.nivel = nivel;}

    public int getVida() {return vida;}

    public void setVida(int vida) {
        this.vida = vida;}

    //Outros métodos
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vda: " + vida);
    }

}

package Exercicios;

    // 1. construção da classe
    public class Termostato {

    // 2. Atributos
    private double temperaturaAtual;

        // 3.Construtores
        public Termostato() {
            this.temperaturaAtual = 20.0;
        }

    // 4. Métodos getters e setters
    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        if (temperaturaAtual >= 15.0 && temperaturaAtual <= 30.0) {
            this.temperaturaAtual = temperaturaAtual;
        } else {
            System.out.println("ERRO!");}
    }

    // 5. Métodos Operacionais - Lógica Condicional
    public void exibirStatus(){
        if (temperaturaAtual <= 22.0) {
            System.out.println("Modo Economico");
        }else{
            System.out.println("Modo Conforto");

        }

    }
}

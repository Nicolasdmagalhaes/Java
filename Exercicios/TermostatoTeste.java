package Exercicios;

public class TermostatoTeste {

    public void main(String[] args){
        //Criando objeto de termometro
        Termostato t = new Termostato();

        System.out.println("*** Termostato ***");
        System.out.println("Temperatura: " + t.getTemperaturaAtual());
        t.exibirStatus();

        System.out.println("\n---------------------------------------------\n");

        System.out.println("--------teste 1 --------");
        t.setTemperaturaAtual(29.0);
        System.out.println("Temperatura: " + t.getTemperaturaAtual() + " graus");
        t.exibirStatus();

        System.out.println("\n---------------------------------------------\n");

        System.out.println("--------teste 2 --------");
        t.setTemperaturaAtual(15.0);
        System.out.println("Temperatura: " + t.getTemperaturaAtual() + " graus");
        t.exibirStatus();
        t.setTemperaturaAtual(10.0);
        t.setTemperaturaAtual(22.0);
        System.out.println("Temperatura: " + t.getTemperaturaAtual() + " graus");








    }
}

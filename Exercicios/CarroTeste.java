package Exercicios;

public class CarroTeste {
    public static void main (String[] args){
        //construtor padrão
        Carro c1 = new Carro();
        c1.exibirInfo();
        System.out.println("---------------------------");

        //Contrutor parametrizado
        Carro c2 = new Carro( "ferrari","F50",2026);
        c2.setCor("Vermelha");
        c2.setPreço(10000);

        c2.exibirInfo();
        System.out.println("---------------------------");

        //Construtor cheio
        Carro c3 = new Carro("Honda", "Civic", 2027,"Prata",50000 );
        c3.exibirInfo();
        System.out.println("---------------------------");
















    }








}

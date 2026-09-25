package Exercicios;

public class ContaTeste {
    public static void main(String [] args){

        //Construtor padrão / construir objeto
        Conta c1 = new Conta ();
        c1.Info();

        System.out.println("---------------------------");

        //Cosntrutor parametrizado
        Conta c2 = new Conta ("Paulo", 123456789, 500  );
        c2.setTipoCt("PJ");
        c2.Info();

        System.out.println("---------------------------");

        //Construtor cheio
        Conta c3 = new Conta("Nicolas", 257987321, "PJ", 1000000000, true);
        c3.Info();























    }










}

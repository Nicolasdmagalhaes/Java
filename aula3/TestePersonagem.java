package aula3;

public class TestePersonagem {

    public static void main(String[] args){

        // 1. Usando o construtor padrão
        Personagem p1 = new Personagem();
        Personagem p2 = new Personagem();
 //       System.out.println("Dados do objeto p1: ");
 //       System.out.println("Nome: " + p1.getNome());
 //       System.out.println("Nivel: " + p1.getNivel());
 //       System.out.println("Vda: " + p1.getVida());
        p1.exibirInfo();

        System.out.println("---------------------------");

 //       System.out.println("Dados do objeto p2: ");
 //       System.out.println("Nome: " + p2.getNome());
 //       System.out.println("Nivel: " + p2.getNivel());
 //       System.out.println("Vda: " + p2.getVida());
        p2.exibirInfo();

        System.out.println("---------------------------");

        // 2. Usando o construtor parametizado
        Personagem p3 = new Personagem("Aragorn", 15);
        Personagem p4 = new Personagem("legolas", 12);

 //       System.out.println("Dados do objeto p3: ");
 //       System.out.println("Nome: " + p3.getNome());
 //       System.out.println("Nivel: " + p3.getNivel());
//        System.out.println("Vda: " + p3.getVida());
        p3.exibirInfo();

        System.out.println("---------------------------");

//        System.out.println("Dados do objeto p4: ");
//        System.out.println("Nome: " + p4.getNome());
//        System.out.println("Nivel: " + p4.getNivel());
//        System.out.println("Vda: " + p4.getVida());
        p4.exibirInfo();
    }


}

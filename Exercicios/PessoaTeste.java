package Exercicios;

public class PessoaTeste {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());

        p1.setNome("Java");
        p1.setIdade(21);
        p1.setSexo("Masculino");

        System.out.println("\n---------------------------------------------\n");

        System.out.println("nome: " + p1.getNome());
        System.out.println("idade: " + p1.getIdade());
        System.out.println("Sexo: " + p1.getSexo());

















    }
}

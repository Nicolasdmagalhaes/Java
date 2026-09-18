package Exercicios;

public class AlunoTeste {
    public static void main (String[] args){

        Aluno aluno = new Aluno();

        aluno.setNome("Nicolas");
        aluno.setTurma("TDSPT1");
        aluno.setnota1(7.4f);
        aluno.setnota2(8.5f);
        aluno.setnota3(5.0f);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota1: " + aluno.getnota1());
        System.out.println("Nota2: " + aluno.getnota2());
        System.out.println("Nota3: " + aluno.getnota3());
        System.out.printf("Média: %.1f%n", aluno.getMedia());
        System.out.println(aluno.getSituacao());




























    }
}

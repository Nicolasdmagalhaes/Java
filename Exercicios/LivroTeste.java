package Exercicios;

public class LivroTeste {
    public static void main(String[] args){
        //construtor padrão
        Livro l1 = new Livro();
        l1.exibirInfo();

        System.out.println("\n---------------------------------------------\n");

        //construtor parametrizazdo
        Livro l2 = new Livro("Javeiro", "Nicolas D.", 700);
        l2.setEditora("Prada");
        l2.setDisponivel(true);
        l2.exibirInfo();














    }
}

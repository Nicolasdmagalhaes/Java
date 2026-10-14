package Exercicio_para_entregar;

public class LivroTeste {
    public static void main(String[] args) {

        // Criando o produto com o construtor vazio
        Livro l1 = new Livro();
        System.out.println("\n=== Testando construtor vazio ===");
        l1.exibirdadosdoLivro();
        System.out.println("\n=== construtor vazio sendo modificado ===");
        l1.setTitulo("Javeiro");
        l1.setAutor("Legolas");
        l1.setPreco(250.00);
        l1.exibirdadosdoLivro();

       // Construtor parametrizado
        Livro l2 = new Livro("As duas torres","Frodo",1000.00);
        System.out.println("\n=== Testando construtor parametrizado ===");
        l2.exibirdadosdoLivro();

















    }
}

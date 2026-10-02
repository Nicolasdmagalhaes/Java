package Exercicio_para_entregar;

public class ProdutoTeste {
    public static void main(String[] args) {

        // Criando o produto com o construtor vazio
        Produto p1 = new Produto ();
        System.out.println("\n=== Testando construtor vazio ===");
        p1.exibirDetalhes();
        // Mudando os seters
        p1.setNome("Celular");
        p1.setPreco(2700.00);
        p1.setQuantidadeEstoque(10);
        p1.exibirDetalhes();

        System.out.println("\n=== Testando o outro construtor ====");

        //Criando o produto com o construtor completo
        Produto p2 = new Produto ("Tv" , 7000.00, 7);
        System.out.println("=== Estado inicial ===");
        p2.exibirDetalhes();

        System.out.println("\n=======");

        System.out.println("=== Modificando com os outros metodos  ===");
        // Método adicionarEstoque
        System.out.println("Chegaram 7 tv: " + p2.adicionarEstoque(7));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("Chegaram 5 tv: " + p2.adicionarEstoque(0));
        System.out.println("Sairam 5 tv: " + p2.adicionarEstoque(-5));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("\n=======");
        // Método realizarvenda
        System.out.println("Vender 7 tv: " + p2.realizarVenda(7));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("Vender 3 tv: " + p2.realizarVenda(3));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("Vender 7 tv: " + p2.realizarVenda(8));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("Vender -8 tv: " + p2.realizarVenda(-8));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());
        System.out.println("Vender 4 tv: " + p2.realizarVenda(4));
        System.out.println("Estoque atual: " + p2.getQuantidadeEstoque());


































    }
















}

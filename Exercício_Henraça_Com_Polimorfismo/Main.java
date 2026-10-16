package Exercício_Henraça_Com_Polimorfismo;

public class Main {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();

        // 1. Objetos sendo criados
        Produto generico = new Produto("Bola De Futebol Americano", 250.0);
        ProdutoEletronico eletronico = new ProdutoEletronico("Teclado Mecânico", 350.0, 50.0);
        ProdutoVestuario vestuario = new ProdutoVestuario("Camiseta Da Venum", 100.0, 15.0);

        System.out.println("\n -----------------------------------------------------\n");

        // 2. Polimorfismo: o mesmo metodo recebe os três objetos
        System.out.println("----- Demonstração De Polimorfismo -----");
        caixa.imprimirEtiqueta(generico);
        caixa.imprimirEtiqueta(eletronico);
        caixa.imprimirEtiqueta(vestuario);

        System.out.println("\n -----------------------------------------------------\n");

        // 3. Simulação de compra por categoria
        System.out.println("----- Simulação Ce Compra -----");
        caixa.simularCompraPorCategoria(1, "Notebook Gamer", 4000.0);
        caixa.simularCompraPorCategoria(2, "Shorts De Luta Do Charles Oliveira", 500.0);
        caixa.simularCompraPorCategoria(3, "Luva De MMA", 250.0);
    }
}
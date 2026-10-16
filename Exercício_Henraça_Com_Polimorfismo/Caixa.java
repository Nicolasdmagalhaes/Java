package Exercício_Henraça_Com_Polimorfismo;

public class Caixa {


    // 1. Imprimi a etiqueta de qualquer tipo de Produto (polimorfismo)
    public void imprimirEtiqueta(Produto produto) {
        System.out.println("===== ETIQUETA =====");
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preço base: R$ %.2f%n", produto.getPrecoBase());
        System.out.printf("Preço final: R$ %.2f%n", produto.calcularPrecofinal());
        System.out.println("====================");
    }
    // 2. Criação do produto conforme a categoria escolhida e imprime a etiqueta
    public void simularCompraPorCategoria(int opcao, String nome, double precoBase) {
        Produto produto;

        if (opcao == 1) {
            produto = new ProdutoEletronico(nome, precoBase, 50.0);
        } else if (opcao == 2) {
            produto = new ProdutoVestuario(nome, precoBase, 15.0);
        } else {
            produto = new Produto(nome, precoBase);
        }
        imprimirEtiqueta(produto);
    }

}

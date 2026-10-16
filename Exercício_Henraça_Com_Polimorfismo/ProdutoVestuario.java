package Exercício_Henraça_Com_Polimorfismo;

public class ProdutoVestuario extends Produto {

    // 1. Atributos
    private double percentualDesconto;

    // 2. Construtor
    public ProdutoVestuario(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase);
        this.percentualDesconto = percentualDesconto;
    }

    // 3. Getters e Setters
    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    // 4. Metodo calcaular Herdado preco final + percentual de desconto
    @Override
    public double calcularPrecofinal() {
        return getPrecoBase() - (getPrecoBase() * percentualDesconto / 100);
    }
}

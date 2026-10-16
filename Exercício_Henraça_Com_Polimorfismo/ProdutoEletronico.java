package Exercício_Henraça_Com_Polimorfismo;

public class ProdutoEletronico extends Produto {

    // 1. Atributos
    private double taxaGarantiaEstendida;

    // 2. Construtor
    public ProdutoEletronico(String nome, double precoBase, double taxaGarantiaEstendida) {
        super(nome, precoBase);
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    // 3. Getters e Setters
    public double getTaxaGarantiaEstendida() {
        return taxaGarantiaEstendida;
    }

    public void setTaxaGarantiaEstendida(double taxaGarantiaEstendida) {
        this.taxaGarantiaEstendida = taxaGarantiaEstendida;
    }

    // 4. Metodo calcular Herdado + 10% de impsoto + a Taxa de garantia estendida
    @Override
    public double calcularPrecofinal() {
        return getPrecoBase() * 1.10 + taxaGarantiaEstendida;
    }
}

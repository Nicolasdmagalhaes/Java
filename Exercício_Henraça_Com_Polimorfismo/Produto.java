package Exercício_Henraça_Com_Polimorfismo;

public class Produto {

    // 1. Atributos
    private String nome;
    private double precoBase;

    // 2. Construtor
    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    // 3. Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    // 4. Metodo criado - Calcular Preco Final
    public double calcularPrecofinal() {
        return precoBase;
    }
}

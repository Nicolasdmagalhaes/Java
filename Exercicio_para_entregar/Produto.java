package Exercicio_para_entregar;

public class Produto {


    //atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtores
    public Produto (){
        this.nome = "";
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }
    // Construtores Parametrizado
    public Produto(String nome,double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Método de exibição
    public void exibirDetalhes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade do produto no estoque: " + quantidadeEstoque);
    }

    //Métodos operacionais
    public boolean adicionarEstoque(int qdt) {
        if (qdt > 0) {
            quantidadeEstoque += qdt;
            return true;
        }else{
            return false;
        }
    }
    public boolean realizarVenda(int qdt) {
        if (qdt > 0 && qdt <= quantidadeEstoque) {
            quantidadeEstoque -= qdt;
            return true;
        }else{
            return false;

        }
    }
}

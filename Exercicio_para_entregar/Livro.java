package Exercicio_para_entregar;

public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private double preco;


    //construtor vazio
    public Livro (){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //cosntrutor parametrizado
    public Livro (String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void exibirdadosdoLivro() {
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Preço do livro: " + preco);


    }
}

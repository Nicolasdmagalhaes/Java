package Exercicios;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int paginas;
    //Atributos extras
    private String editora;
    private boolean disponivel;

    //Construtores
    public Livro(){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponivel = false;
    }
    //Contrutor parametrizado
    public Livro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    //Construtor cheio
    public Livro(String titulo, String autor, int paginas, String editora, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editora = editora;
        this.disponivel = disponivel;
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

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isDisponivel() {return disponivel;}

    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public void exibirInfo(){
       System.out.println("Titulo do livro: " + titulo);
       System.out.println("Autor: " + autor);
       System.out.println("Quantidade de páginas: " + paginas);
       System.out.println("Editora: " + editora);



    }
}

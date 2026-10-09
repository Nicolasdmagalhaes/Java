package aula5;

public class Conteudo {

    //Atributos
    private String titulo;
    private String genero;
    private int duracaoMinutos;

    //Construtor da super classe
    public Conteudo(String titulo, String genero, int duracaoMinutos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoMinutos = duracaoMinutos;
    }

    //Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos > 0) {
            this.duracaoMinutos = duracaoMinutos;
        }else {
            System.out.println("Erro: o tempo de duracao deve ser positivo");
        }
    }
    //Metodos comum que ambas as filhas herdarão
    public void darPlay(){
        System.out.println("O conteudo " + this.titulo + " está carregando...");
        System.out.println("aeeeeeeee está carregando em 3 min");

    }
}

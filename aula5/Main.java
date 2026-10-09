package aula5;

public class Main {
    public static void main(String[] args) {

        //1. Instacicando e testando um filme
        Filme meuFilme = new Filme("Batman", "Animação", 170, true);
        meuFilme.exibirDetalhes();
        meuFilme.darPlay(); //metodo herdar

        System.out.println("\n=============================\n");

        //2. Instacicando e testando um Serie
        Serie minhaSerie = new Serie("flash", "comedia", 45, 4);
        minhaSerie.exibirDetalhes();
        minhaSerie.darPlay();
    }
}

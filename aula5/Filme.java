package aula5;

//sub class de conteudo como a Serie (Herança)

public class Filme extends Conteudo{

    //Atributos
    public boolean indicacaoOscar;


    //Construtor
    public Filme(String titulo, String genero, int duracaoMinutos, boolean indicacaoOscar) {
        super(titulo, genero, duracaoMinutos);
        this.indicacaoOscar = indicacaoOscar;
    }


    //Getters e Setters
    public boolean isIndicacaoOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(boolean temOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }

    // Metodo exibir os dados do filme
    public void exibirDetalhes() {
        System.out.println("=== EXIBIR DETALHES DO FILME===");

        // Usamos o metodo gettitulo por o atributo titulo é privado
        System.out.println("TItulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duração do filme: " + this.getDuracaoMinutos());

        if (this.indicacaoOscar){
            System.out.println("Filme Indicado para o OSCAR!");
        }else{
            System.out.println("Filme não foi Indicado para o OSCAR!");
        }
    }
}

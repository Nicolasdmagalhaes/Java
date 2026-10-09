package aula5;

//sub class de conteudo como o filme (Herança)

public class Serie extends Conteudo{

    //Atributos
    private int totalTemporadas;


    //Contrutor
    public Serie(String titulo, String genero, int duracaoMinutos, int totalTemporadas) {
        super(titulo, genero, duracaoMinutos);
        this.totalTemporadas = totalTemporadas;
    }

    //Getters e Setters
    public int getTotalTemporadas() {
        return totalTemporadas;
    }
    public void setTotalTemporadas(int totalTemporadas) {
        if (totalTemporadas > 0){
            this.totalTemporadas = totalTemporadas;
        }else{
            System.out.println("Erro: não foi possivel definir a temporada");
        }
    }
    //Metodos exibir dados
    public void exibirDetalhes(){
        System.out.println("=== EXIBIR DETALHES DA SÈRIE===");

        System.out.println("TItulo: " + this.getTitulo());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Duração do filme: " + this.getDuracaoMinutos());
        System.out.println("Temporadas: " + this.getTotalTemporadas());
    }
}

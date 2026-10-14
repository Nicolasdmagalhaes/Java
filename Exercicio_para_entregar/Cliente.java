package Exercicio_para_entregar;

public class Cliente {

    // atributos
    private String nome;
    private String cpf;
    private double saldocarteira;

    //construtor vazio
    public Cliente (){
        this.nome = nome;
        this.cpf = cpf;
        this.saldocarteira = saldocarteira;
    }
    //cosntrutor parametrizado
    public Cliente (String nome, String cpf, double saldocarteira){
        this.nome = nome;
        this.cpf = cpf;
        this.saldocarteira = saldocarteira;
    }
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldocarteira() {
        return saldocarteira;
    }

    public void setSaldocarteira(double saldocarteira) {
        this.saldocarteira = saldocarteira;
    }

    //Métodos operacionais
    public boolean realizarPagamento(double valor) {
        if (saldocarteira >= valor) {
            saldocarteira -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.printf("Saldo: R$   ", saldocarteira);
    }
}


package Exercicios;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private float preço;

    //construdor padrão
    public Carro () {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preço = preço;
    }
    //Construtor parametrizado
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    //Construtor Cheio
    public Carro(String marca, String modelo, int ano, String cor, float preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preço = preço;
    }

    public String getMarca() {return marca;}

    public void setMarca(String marca) {
        this.marca = marca;}

    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {return ano;}

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {return cor;}

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreço() {return preço;}

    public void setPreço(float preço) {
        this.preço = preço;
    }
    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço: " + preço);
    }
}

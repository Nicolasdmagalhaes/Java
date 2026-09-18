package Exercicios;

//Criação da classe
public class Aluno {

//Criação de atributos
    private String Nome;
    private String Turma;
    private float nota1;
    private float nota2;
    private float nota3;
    private boolean aprovado;

//Métodos de acesso e modificadores - getters() e setters() | sempre colocar o ; no get antes de fechar a chave
    public String getNome() {return Nome;}
    public void setNome (String Nome) {
        this.Nome = Nome;}
    public String getTurma() {return Turma;}
    public void setTurma (String turma){
        this.Turma = Turma;}
    public float getnota1() {return nota1;}
    public void setnota1 (float nota1){
        this.nota1 = nota1;}
    public float getnota2() {return nota2;}
    public void setnota2 (float nota2){
        this.nota2 = nota2;}
    public float getnota3() {return nota3;}
    public void setnota3 (float nota3){
        this.nota3 = nota3;}
    public boolean isAprovado() {return getMedia() >= 6.0;}
    public String getSituacao() {
        if (getMedia() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }public double getMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }







}

package Exercicios;

public class Conta {
    // Atributos
    private String titular;
    private int numeroct;
    private String tipoCt;
    private float saldo;
    private boolean status;

    //Construtor padrão
    public Conta (){
        this.titular = titular;
        this.numeroct = numeroct;
        this.tipoCt = tipoCt;
        this.saldo = saldo;
        this.status = status;
    }
    //Construtor parametrizado
    public Conta(String titular, int numeroct, float saldo){
        this.saldo = saldo;
        this.numeroct = numeroct;
        this.titular = titular;
    }
    //Construtor cheio
    public Conta(String titular, int numeroct, String tipoCt, float saldo, boolean status){
        this.titular = titular;
        this.numeroct = numeroct;
        this.tipoCt = tipoCt;
        this.saldo = saldo;
        this.status = status;
    }

    public String getTitular() {return titular;}

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroct() {return numeroct;}

    public void setNumeroct(int numeroct) {
        this.numeroct = numeroct;
    }

    public String getTipoCt() {return tipoCt;}

    public void setTipoCt(String tipoCt) {
        this.tipoCt = tipoCt;
    }

    public float getSaldo() {return saldo;}

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {return status;}

    public void setStatus(boolean status) {
        if (status){
            System.out.println("Ativa");}
        else{System.out.println("Não ativa");
        }
        this.status = status;
    }
    //Outros métoddos
    public void Info(){
       System.out.println("Titular: " + titular);
       System.out.println("Número da conta: " + numeroct);
       System.out.println("Tipo da conta: " + tipoCt);
       System.out.println("Saldo da conta: " + saldo );
        if (status) {
            System.out.println("Status da conta: Ativa!");
        } else {
            System.out.println("Status da conta: Não ativa!");
        }

    }

}

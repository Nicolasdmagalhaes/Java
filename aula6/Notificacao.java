package aula6;

public class Notificacao {

    // 1. Atributos
    private String destinatario;
    private String mensagem;

    // 2. Cosntrutor
    public Notificacao(String destinatario, String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    // 3. Getters e Setters
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    // 4. Comportamento generico que será sobrescrito (Override)
    public void enviar() {
        System.out.println("Enviando uma mensagem (generica) para " + this.destinatario);

    }
}

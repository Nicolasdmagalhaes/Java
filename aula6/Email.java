package aula6;

public class Email extends Notificacao {

    // Atributo
    private String assunto;

    //Construtor
    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    // Getters e Setters
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    // Metodo enviar
    @Override
    public void enviar(){
        System.out.println("---Enviando E-mail---");
        System.out.println("Assunto: " + this.assunto);
        System.out.println("Destinatario: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}

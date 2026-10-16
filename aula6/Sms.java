package aula6;

public class Sms extends Notificacao {

    // Construtor
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    // Metodo enviar
    @Override
    public void enviar() {
        System.out.println("---Enviando SMS---");
        System.out.println("Celular: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}

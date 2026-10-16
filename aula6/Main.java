package aula6;

public class Main {


    // Metodo que aceita qualquer notificacao - O coração do Polimorfismo

    public static void dispararAlerta(Notificacao notificacao) {
        System.out.println("\n [SISTEMA DE ALERTA}");
        notificacao.enviar(); // O Java decide em tempo de execução qual metodo enviar() será chamado.

    }

    public static void main(String[] args) {

        // Declaração de tipo Generico (Generics) apontando para instanancias especificas
        Notificacao n1 = new Email("aluno@fiap.com.br", "CP realizado com sucesso!", "Aviso Importante");
        Notificacao n2 = new Sms("1199999-8888", "Aula de hoje - Não se atrase!");


        System.out.println("\n ------------Chamada Direta------------------\n");

        // Chamada Direta
        n1.enviar();
        n2.enviar();

        System.out.println("\n --------------Usando o metodo POLIMORFICO com condicionais simples----------------\n");

        // Usando o metodo POLIMORFICO com condicionais simples
        // 1 - Enviar email
        // 2 - Enviar SMS
        dispararAlerta(n1);
        dispararAlerta(n2);

        System.out.println("\n -----------POLIMORFICO com condicionais-------------------\n");

        // Usando o metodo POLIMORFICO com condicionais
        // 1 - Enviar email
        // 2 - Enviar SMS
        int tipoCanal = 2;
        Notificacao notificacaoEscolhida = null;

        if(tipoCanal == 1) {
            notificacaoEscolhida = new Email("aluno2@fiap.com.br", "Alo, turma!", "Aula de JAVA");
        }else if(tipoCanal == 2) {
            notificacaoEscolhida = new Sms("1199999-1111", "Aula de hoje - Estamos quase terminando");
        }

        // Não importa o tipo de dado concreto. O metodo trata como Notificação
        dispararAlerta(notificacaoEscolhida);



    }
}
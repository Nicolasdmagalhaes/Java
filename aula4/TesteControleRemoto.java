package aula4;

public class TesteControleRemoto {
    // 1. Criação de classe
    public static void main(String[] args) {

        // 2. Criar objeto de Controle Remoto (Construtor Vazio)
        ControleRemoto controle = new ControleRemoto();

        System.out.println("***Controle Remoto***");
        System.out.println("Estado:" + controle.isLigado());
        System.out.println("Volume:" + controle.getVolume());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("--------teste 1 --------");
        controle.setVolume(300);
        System.out.println("Volume:" + controle.getVolume());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("---teste 2 ---");
        controle.ligarDesligar();
        System.out.println("Volume: " + controle.isLigado());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("---teste 3 ---");
        controle.aumentarVolume();
        controle.aumentarVolume();
        System.out.println("Volume:" + controle.getVolume());
        controle.setVolume(-3);
        controle.setCanal(25);
        System.out.println("Canal:"+ controle.getCanal());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("---teste 4---");
        controle.diminuirVolume();
        controle.diminuirVolume();
        controle.diminuirVolume();
        System.out.println("Volume:" + controle.getVolume());
        controle.setVolume(200);
        System.out.println("Volume:" + controle.getVolume());

        System.out.println("\n---------------------------------------------\n");

        System.out.println("---teste 5---");
        controle.setCanal(297);
        controle.subirCanal();
        controle.subirCanal();
        controle.subirCanal();
        System.out.println("Canal:" + controle.getCanal());

        System.out.println("\n---------------------------------------------\n");
        System.out.println("---teste 6---");
        controle.subirCanal();
        controle.subirCanal();
        System.out.println("Canal:" + controle.getCanal());























    }
}

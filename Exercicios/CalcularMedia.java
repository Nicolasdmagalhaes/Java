package Exercicios;
import java.util.Scanner;
public class CalcularMedia {
    static void main() {

    //Criação de scanner mais o obj que seria o scanner!
    Scanner input = new Scanner(System.in);
    //Atributos
    String nome;
    float n1, n2, n3, media; // Ajuntei as notas e a média em 1 mesmo atributo

    //atribuição
        System.out.println("Digite seu nome: ");
        nome = input.nextLine(); //esse nextLine é para ler uma linha só
        System.out.println("Digite sua primeira nota: " );
        n1 = input.nextFloat();
        System.out.println("Digite sua segunda nota: " );
        n2 = input.nextFloat();
        System.out.println("Digite sua terceira nota: " );
        n3 = input.nextFloat();

    // Conta
    media = (n1 + n2 + n3)/3;

    // Print final para juntar media mais nome do aluno
        System.out.printf("%s  sua média foi: %.1f%n", nome, media);


    }
}

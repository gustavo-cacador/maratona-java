package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei Sim ou Não!");
        String pergunta = scanner.nextLine();
        if(pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}

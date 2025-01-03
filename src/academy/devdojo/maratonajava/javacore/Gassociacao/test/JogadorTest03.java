package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ganso");
        Jogador jogador2 = new Jogador("Neymar");
        Time time = new Time("Santos");

        Jogador [] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();

        //jogador2.imprime();

        System.out.println("--- Time ---");

        time.imprime();

    }
}

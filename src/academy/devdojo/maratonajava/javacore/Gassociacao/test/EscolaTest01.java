package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Heraclito Sensei");
        Professor professor2 = new Professor("Erlon Brabo");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Agenor", professores);

        escola.imprime();
    }
}
